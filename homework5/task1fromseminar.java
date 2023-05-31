package homework5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task1fromseminar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое слово: ");
        String firstWord = input.nextLine();
        System.out.println("Введите второе слово: ");
        String secondWord = input.nextLine();
        input.close();
        System.out.println(isIsomorf(firstWord, secondWord, 1));
    }

    public static Boolean isIsomorf(String str1, String str2, int flag) {
        if (str1.length() != str2.length())
            return false;
        else {
            Map<Character, Character> newMap = new HashMap<>();
            for (int i = 0; i < str1.length(); i++) {
                if (newMap.containsKey(str1.charAt(i)) && str2.charAt(i) != newMap.get(str1.charAt(i))) {
                    return false;
                } else
                    newMap.put(str1.charAt(i), str2.charAt(i));
            }
            if (flag == 1)
                return isIsomorf(str1, str2, 0);
            else return true;
        }
        
    }
}