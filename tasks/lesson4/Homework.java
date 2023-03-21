package tasks.lesson4;


import java.util.ArrayList;
import java.util.Scanner;



public class Homework {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {

            String input = scanner.nextLine();

            if(input.equals("exit")) {
                break;
            }

            String[] inputText = input.split("~");
            int num = -1;

            if (inputText.length == 2) {
                try {
                    num = Integer.parseInt(inputText[1]);
                    if (inputText[0].equals("print")) {
                        try {
                            System.out.println(list.get(num));
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Выход за пределы массива");
                        }
                    }
                    else {
                        while (list.size() <= num) {
                            list.add(null);
                        }
                        list.set(num, inputText[0]);
                    }
                } catch (NumberFormatException ex) {
                    System.out.println("Неверные данные");
                }

            }
            else {
                System.out.println("Неверные данные");
            }
        }
    }
}