import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

public class csv {
    public static void main(String[] args) throws IOException {


        String csvFilename = "/home/gslab/Desktop/java/Assignment/file-handling/100 Sales Records.csv";
        CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
        String[] row = null;
        while ((row = csvReader.readNext()) != null) System.out.println(row[0]);
        csvReader.close();
    }
}