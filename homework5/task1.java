package homework5;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Map.Entry;

public class task1 {
    static HashMap<String, Deque<String>> lib = new HashMap<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Что вы хотите сделать?");
        System.out.println("1) Добавить номер");
        System.out.println("2) Вывести всё");
        Integer choice = input.nextInt();
        if (choice == 1) {
            addNumber(lib);
            main(args);
        } else if (choice == 2) {
            printAll(lib);
            main(args);
        } else if (choice == 0) {
            System.out.println("Ну и правильно, деньги на балансе сэкономишь");
        } else {
            System.out.println("Нет такого действия");
            main(args);
        }
    }

    public static HashMap<String, Deque<String>> addNumber(HashMap<String, Deque<String>> lib) {
        Deque<String> numberList = new LinkedList<>();
        System.out.print("Введите фамилию: ");
        Scanner in = new Scanner(System.in);
        String lastName = in.nextLine();
        System.out.print("Введите номер: ");
        String phoneNumber = in.nextLine();
        if (lib.containsKey(lastName)) {
            Deque<String> phone = lib.get(lastName);
            while (phone.size() != 0) {
                numberList.add(phone.poll());
            }
            numberList.add(phoneNumber);
            lib.put(lastName, numberList);
        } else {
            numberList.add(phoneNumber);
            lib.put(lastName, numberList);
        }
        return lib;
    }

    public static void printAll(HashMap<String, Deque<String>> lib) {
        for (Entry<String, Deque<String>> name : lib.entrySet()) {
            System.out.printf("[%s: %s]\n", name.getKey(), name.getValue());
        }
    }
}
