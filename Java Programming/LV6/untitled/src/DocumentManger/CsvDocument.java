package DocumentManger;

import java.util.ArrayList;

public class CsvDocument extends Document {

    ArrayList<String>lines = new ArrayList<>();

    public CsvDocument(String fileName) {
        super(fileName);
    }


    public void addDocument (Document a) {
        lines.add(a.toString());
    }

    public void printDocument () {
        System.out.println("fileName = " + fileName);

        for (String line : lines) {
            System.out.println("line = " + line);
        }
    }







}
