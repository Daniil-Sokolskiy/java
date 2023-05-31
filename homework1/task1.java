import java.util.Scanner;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
// Ввод:5
// Треугольное число 1 + 2 + 3 + 4 + 5 = 15
// n! 1 * 2 * 3 * 4 * 5 = 120

public class task1 {
    public static double fact(int n) {
        if (n == 1)
            return 1;
        return n * fact(n - 1);
    }

    public static void main() {
        Scanner input = (new Scanner((System.in)));
        System.out.print("Input a number: ");
        int num = input.nextInt();
        input.close();
        int sum = 0;
        for (int i = 0; i < num + 1; i++) {
            sum += i;
        }
        System.out.println("Треугольное число " + num + " = " + sum);
        System.out.println("Факториал " + num + " = " + fact(num));

    }
}
