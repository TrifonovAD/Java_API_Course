package tasks.leсtures;

import java.io.File;

public class lecture2_3 {
    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.t12xt");
            File file = new File(pathFile);
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        }
        finally {
            System.out.println("finally");
        }
    }
}
