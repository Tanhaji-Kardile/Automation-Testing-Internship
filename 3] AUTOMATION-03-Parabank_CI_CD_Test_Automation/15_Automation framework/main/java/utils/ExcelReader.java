package utils;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReader {

    public static Object[][] getExcelData(String filePath,
                                          String sheetName) {

        Object[][] data = null;

        try {

            FileInputStream fis =
                    new FileInputStream(filePath);

            Workbook workbook =
                    WorkbookFactory.create(fis);

            Sheet sheet =
                    workbook.getSheet(sheetName);

            if (sheet == null) {

                throw new RuntimeException(
                        "Sheet Not Found: " + sheetName);
            }

            int rowCount = sheet.getPhysicalNumberOfRows();

            Row headerRow = sheet.getRow(0);

            int colCount = 0;

            for (int i = 0; i < headerRow.getLastCellNum(); i++) {

                if (headerRow.getCell(i) != null &&
                    !headerRow.getCell(i)
                              .toString()
                              .trim()
                              .isEmpty()) {

                    colCount++;
                }
            }

            data = new Object[rowCount - 1][colCount];

            DataFormatter formatter =
                    new DataFormatter();

            for (int i = 1; i < rowCount; i++) {

                for (int j = 0; j < colCount; j++) {

                    if (sheet.getRow(i).getCell(j) != null) {

                        data[i - 1][j] =
                                formatter.formatCellValue(
                                        sheet.getRow(i).getCell(j));
                    } else {

                        data[i - 1][j] = "";
                    }
                }
            }

            workbook.close();
            fis.close();

        } catch (Exception e) {

            e.printStackTrace();

            throw new RuntimeException(
                    "Failed To Read Excel File");
        }

        return data;
    }
}