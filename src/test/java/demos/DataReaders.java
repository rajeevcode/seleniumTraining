package demos;

import utilities.CSV;

import java.util.List;

public class DataReaders {

    public static void main(String[] args) {
        readCSV ( );
    }

    private static void readCSV() {
        String filename = "/Users/rajeev.kumar/git/seleniumTraining/csvfile/UserAccounts.csv";
        List <String[]> records = utilities.CSV.get (filename);

        for (String[] record : records) {
            for (String field : record) {
                System.out.println (field);
            }
        }
    }
}