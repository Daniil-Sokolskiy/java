import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

//Вывести все простые числа от 1 до 1000

public class task2 {
    public static boolean simple(long n) {
        {
            for (long i = 2; i <= Math.pow(n, 0.5); i++)
                if (n % i == 0)
                    return false;
            return true;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        long num = input.nextLong();
        input.close();
        FileWriter fwriter = new FileWriter("simple_numbers.txt");
        for (long i = 2; i < num + 1; i++) {
            if (simple(i) == true) {
                fwriter.write(Long.toString(i) + "\n");
            }
        }
        fwriter.close();
        BufferedReader fread = new BufferedReader(new FileReader("simple_numbers.txt"));
        String line;
        while ((line = fread.readLine()) != null) {
            System.out.println(line);
        }
        fread.close();
    }
}
