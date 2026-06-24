package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CSVReaderUtil {

    public static Object[][] getCSVData(String filePath) {

        List<Object[]> dataList = new ArrayList<>();

        try {

            CSVReader reader =
                    new CSVReader(new FileReader(filePath));

            String[] line;

            // Skip Header
            reader.readNext();

            while ((line = reader.readNext()) != null) {

                dataList.add(new Object[] {
                        line[0],
                        line[1],
                        line[2]
                });
            }

            reader.close();

        } catch (IOException | CsvValidationException e) {

            e.printStackTrace();
        }

        Object[][] data =
                new Object[dataList.size()][3];

        for (int i = 0; i < dataList.size(); i++) {

            data[i] = dataList.get(i);
        }

        return data;
    }
}