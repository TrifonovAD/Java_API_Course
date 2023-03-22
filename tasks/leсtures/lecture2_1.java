package tasks.leсtures;

public class lecture2_1 {

    public static void main(String[] args) {

        var startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 200_000; i++) {
            sb.append("+");
        }
        var endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        String str = "";
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 200_000; i++) {
            str += "+";
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
