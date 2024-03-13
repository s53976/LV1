package fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class OI {
    public static void main(String[] args) {

        File file = new File ("");
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        int byteRead;

        /*while ((byteRead = fis.read()) != -1);
        char c = (char) byteRead;
        System.out.print(c);
*/

    }
}
