//Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа.

package tasks.lesson3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {

        // Создаем список из 20 элементов, заполненных случайными числами от 0 до 100

        Random rnd = new Random();
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int number = rnd.nextInt(0, 100);
            myList.add(number);
        }
        System.out.printf("Original list: %s\n", myList);
        System.out.printf("New list: %s", removeOddNumber(myList));

    }

    private static List<Integer> removeOddNumber(List<Integer> myList){
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) % 2 != 0) {
                myList.remove(i);
                i--;
            }
        }
        return myList;

    }
}
