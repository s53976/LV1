package Streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoApp {
    public static void main(String[] args) {


    File file = new File("/Users/julianirmler/Downloads/sub-ordner/dokumente/er hörte leise.txt");
        try (FileOutputStream fos = new FileOutputStream(file)){

            String someText = "Some Text";
            for (char c : someText.toCharArray()){
                fos.write(c);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
