package fileio;
import java.io.File;
public class FileSizeCalculator {

        public static void main(String[] args) {
            File folder = new File("/Users/julianirmler/Downloads/sub-ordner");
            long totalSize = printAndGetSize(folder);
            System.out.println("Total size of files and subfolders: " + totalSize + " bytes");
        }

        public static long printAndGetSize(File file) {
            long totalSize = 0;

            if (file.isFile()) {
                System.out.println("File: " + file.getName() + ", Size: " + file.length() + " bytes");
                return file.length();
            } else if (file.isDirectory()) {
                File[] files = file.listFiles();
                if (files != null) {
                    for (File f : files) {
                        totalSize += printAndGetSize(f);
                    }
                }
            }

            return totalSize;
        }
    }

