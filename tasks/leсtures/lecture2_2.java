package tasks.leсtures;

import java.io.File;

public class lecture2_2 {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File file = new File(pathFile);
        System.out.println(file.getAbsolutePath());
    }
}
