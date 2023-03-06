import java.util.Arrays;

public class homework1 {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(-3)); // false

        printString("abcd", 5); // abcdabcdabcdabcdabcd

        System.out.println(isLeapYear(2024)); // true
        System.out.println(isLeapYear(2023)); // false

        System.out.println();
        int[] myArray = createArray(5,8);
        System.out.println(Arrays.toString(myArray)); // [8, 8, 8, 8, 8]
        int[] myArray2 = createArray(6,12);
        System.out.println(Arrays.toString(myArray2)); // [12, 12, 12, 12, 12, 12]

        /**
         * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
         * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0
         */
        System.out.println();
        int[] myArray3 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(myArray3));

        // Вариант 1. Цикл с условием
        for (int i = 0; i < myArray3.length; i++) {
            if (myArray3[i] == 0) {
                myArray3[i] = 1;
            }
            else myArray3[i] = 0;
        }
        System.out.println(Arrays.toString(myArray3));


        // Вариант 2. Цикл без условия
        for (int i = 0; i < myArray3.length; i++) {
            myArray3[i] = 1 - myArray3[i];
        }
        System.out.println(Arrays.toString(myArray3));

        /**
         * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */

        System.out.println();
        int[] myArray4 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(myArray4));
        System.out.println(Arrays.toString(changeArray(myArray4)));


        /**
         * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
         * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
         * * Также заполнить элементы побочной диагонали
         */
        System.out.println();
        int sizeArray = 5; // квадратный массив размром 5 x 5
        int[][] myArray5 = new int[sizeArray][sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            for (int j = 0; j < sizeArray; j++) {
                if (i == j || j == sizeArray - i - 1) {
                    myArray5[i][j] = 1;
                }
                else myArray5[i][j] = 0;
            }
        }
        for (int[] rows : myArray5) {
            System.out.println(Arrays.toString(rows));
        }
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        }
        return false;
    }

    private static boolean isPositive(int x) {
        return (x > 0);
    }

    private static void printString(String source, int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
        System.out.println();
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if (year > 1584 && ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0))) {
            return true;
        }
        return false;
    }

    private static int[] createArray(int len, int initalValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] myArray = new int[len];
        Arrays.fill(myArray, initalValue);
        return myArray;
    }

    private static int[] changeArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        return array;
    }
}