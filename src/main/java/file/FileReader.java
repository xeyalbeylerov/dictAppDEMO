package file;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReader {
    private static byte[] readFromFileAsBytes(String filename) {
        Path path = Paths.get(filename);
        byte[] file = null;
        try {
            file = Files.readAllBytes(path);
        } finally {
            return file;
        }

    }

    public static byte[] readFromFileAsBytesAndCheck(String filename) {
        boolean isExists = Files.exists(Paths.get(filename));
        if (isExists) {
            return readFromFileAsBytes(filename);
        } else {
            System.out.println("File not found");
            return null;
        }
    }
}
