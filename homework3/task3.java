package homework3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(5, 3, -5, 40, 54, 9, 0, -123, 65, 3, 98);
        IntSummaryStatistics stats = arr.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println(stats);
        arr.stream().max(Comparator.comparing(i -> i))
    .ifPresent(max -> System.out.println("Maximum is " + max));
        arr.stream().min(Comparator.comparing(i -> i))
    .ifPresent(min -> System.out.println("Minimum is " + min));
        arr.stream().mapToInt(i -> i).average()
    .ifPresent(avg -> System.out.println("Average is " + avg));
    }
}
