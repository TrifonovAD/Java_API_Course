//Дан список ArrayList<String>. Удалить из него все строки, которые являются числами
// Пример: ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value")); ["string", "s", "my_value"]

package tasks.lesson3;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.list;

public class Homework2 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "10", "-12", "my_value"));
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            String element = new String(list.get(i));
            try {
                Integer.parseInt(element);
                list.remove(i);
                i--;
            } catch (NumberFormatException ex) {

            }
        }
        System.out.printf("New list %s", list);

    }
}
