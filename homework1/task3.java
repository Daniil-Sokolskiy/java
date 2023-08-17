import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->
public class task3 {
    public static double calc() {
        System.out.print("Input a number: ");
        Scanner num1 = new Scanner(System.in);
        double number1 = num1.nextDouble();
        System.out.print("Input a sign: ");
        Scanner znak = new Scanner(System.in);
        String sign = znak.nextLine();
        System.out.print("Input a number: ");
        Scanner num2 = new Scanner(System.in);
        double number2 = num2.nextDouble();
        num1.close();
        znak.close();
        num2.close();
        double res = 0;
        switch (sign) {
            case "+":
                res = number1 + number2;
                return res;
            case "-":
                res = number1 - number2;
                return res;
            case "/":
                res = number1 / number2;
                return res;
            case "*":
                res = number1 * number2;
                return res;
        }
        return res;
    }

    public static void main(String[] args) throws SecurityException, IOException {
        Logger logger = Logger.getLogger(task1.class.getName());
        FileHandler fh = new FileHandler("homework1/logTaskcalc.xml", false);
        logger.addHandler(fh);
        XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(xml);
        String sb;
        double ans = calc();
        System.out.println(ans);
        sb = String.valueOf(ans);
        logger.info(sb);
    }
}
