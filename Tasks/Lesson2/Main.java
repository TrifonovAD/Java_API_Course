package Tasks.Lesson2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");

        String text = "My text";
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        fileOutputStream.write(bytes);

        fileOutputStream.close();

    }
}
