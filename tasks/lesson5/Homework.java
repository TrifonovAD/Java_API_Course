package tasks.lesson5;


import java.util.*;

public class Homework {

    /**
     * Есть тест. Нужно извлечь из него все слова и отсортировать по длине.
     * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись
     * и
     * ты
     * Еще
     * день друг Пора
     * ..
     *
     */

    static void collectStats(String text) {
        String[] splitText = text.split(" ");
        Map<Integer, List<String>> stats = new HashMap<>();
        for (String st: splitText) {
            List<String> tmpList = new ArrayList<>();
            if (stats.containsKey(st.length())) {
                tmpList = stats.get(st.length());
            }
            tmpList.add(st);
            stats.put(st.length(), tmpList);
        }
        System.out.println(stats);
    }

    public static void main(String[] args) {
        String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        collectStats(text);
    }


}
