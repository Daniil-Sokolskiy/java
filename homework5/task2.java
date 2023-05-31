package homework5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class task2 {
    /*
     * Пусть дан список сотрудников:
     * Иван Иванов
     * Светлана Петрова
     * Кристина Белова
     * Анна Мусина
     * Анна Крутова
     * Иван Юрин
     * Петр Лыков
     * Павел Чернов
     * Петр Чернышов
     * Мария Федорова
     * Марина Светлова
     * Мария Савина
     * Мария Рыкова
     * Марина Лугова
     * Анна Владимирова
     * Иван Мечников
     * Петр Петин
     * Иван Ежов
     * 
     * Написать программу, которая найдет и выведет повторяющиеся имена с
     * количеством повторений.
     * Отсортировать по убыванию популярности Имени.
     */

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Иван Иванов");
        names.add("Светлана Петрова");
        names.add("Кристина Белов");
        names.add("Анна Мусина");
        names.add("Анна Крутова");
        names.add("Иван Юрин");
        names.add("Петр Лыков");
        names.add("Павел Чернов");
        names.add("Марина Светлова");
        names.add("Мария Савина");
        names.add("Мария Рыкова");
        names.add("Марина Лугова");
        names.add("Анна Владимирова");
        names.add("Мария Федорова");
        names.add("Петр Чернышов");
        names.add("Иван Мечников");
        names.add("Петр Петин");
        names.add("Иван Ежов");
        HashSet<String> namSet = new HashSet<>();
        ArrayList<String> onlyNames = new ArrayList<>();
        for (String element : names) {
            String arr[] = element.split(" ", 2);
            String firstWord = arr[0];
            onlyNames.add(firstWord);
            namSet.add(firstWord);
        }
        System.out.println(names);
        ArrayList<String> uniqList = new ArrayList<>();
        for (String el : namSet) {
            uniqList.add(el);
        }
        TreeMap<String, Integer> out = new TreeMap<>();
        for (String name : uniqList) {
            int count = Collections.frequency(onlyNames, name);
            out.put(name, count);
        }
        System.out.println(entriesSortedByValues(out));
    }

    static <K, V extends Comparable<? super V>> SortedSet<Map.Entry<K, V>> entriesSortedByValues(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<Map.Entry<K, V>>(
                new Comparator<Map.Entry<K, V>>() {
                    @Override
                    public int compare(Map.Entry<K, V> e1, Map.Entry<K, V> e2) {
                        int res = e2.getValue().compareTo(e1.getValue());
                        return res != 0 ? res : -1;
                    }
                });
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
}
