package Tasks.Lesson2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class Homework {
    public static void main(String[] args) throws IOException {
        System.out.println(File.separator);
        FileOutputStream fileOutputStream = new FileOutputStream("file.txt");

        String text = "TEXT";
        text = text.repeat(100);

        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        fileOutputStream.write(bytes);

        fileOutputStream.close();

        System.out.println(ABRepeat('a', 'b', 6));


    }

    private static String ABRepeat(char char1, char char2, int count_repeat) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count_repeat / 2; i++) {
            sb.append(char1);
            sb.append(char2);

        }
        return sb.toString();
    }

}




//            System.out.println(buildString(6, 'a', 'b')); // "ababab"
//
//                    Path of = Path.of("file.txt");
//                    System.out.println(Files.exists(of));
//
//                    Files.createFile(of);
//                    System.out.println(Files.exists(of));
//
//                    Path dir = Path.of("file.txt");
////        Files.createDirectories(dir);
//
////        Files.delete(dir);/
//
//                    Files.writeString(dir, "tewtwtt");
//
////        1. Дано четное число N (>0) и символы c1 и c2.
////    Написать метод, который вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.
////            (6, 'a', 'b') -> "ababab"