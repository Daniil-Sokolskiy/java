package homework4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Deque<String> history_sign = new LinkedList<>();
        Deque<Double> history_numbers = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        calc(history_sign, history_numbers, input);
    }

    public static void calc(Deque<String> history_sign, Deque<Double> history_numbers, Scanner input) {
        System.out.print("Input a number: ");
        history_numbers.add(input.nextDouble());
        counting(history_sign, history_numbers, input);
    }

    public static void counting(Deque<String> history_sign, Deque<Double> history_numbers, Scanner input) {
        System.out.print("Input a sign: ");
        history_sign.add(input.next());
        switch (history_sign.peekLast()) {
            case "return":
                history_numbers.pollLast();
                history_numbers.pollLast();
                System.out.println("Текущее число " + history_numbers.peekLast());
                counting(history_sign, history_numbers, input);
                break;

            case "exit":
                System.out.println("Программа окончена");
                return;

            default:
                break;
        }
        System.out.print("Input a number: ");
        history_numbers.add(input.nextDouble());
        double res = 0;
        double num1 = 0;
        switch (history_sign.peekLast()) {
            case "+":
                num1 = history_numbers.pollLast();
                res = num1 + history_numbers.getLast();
                history_numbers.add(num1);
                break;
            case "-":
                num1 = history_numbers.pollLast();
                res = history_numbers.getLast() - num1;
                history_numbers.add(num1);
                break;
            case "/":
                num1 = history_numbers.pollLast();
                res = history_numbers.getLast() / num1;
                history_numbers.add(num1);
                break;
            case "*":
                num1 = history_numbers.pollLast();
                res = history_numbers.getLast() * num1;
                history_numbers.add(num1);
                break;
        }
        history_numbers.add(res);
        System.out.println(history_numbers.peekLast());
        counting(history_sign, history_numbers, input);
    }
}
