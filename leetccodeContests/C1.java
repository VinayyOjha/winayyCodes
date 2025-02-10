import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class C1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();
        scanner.close();

        Map<String, Integer> Count = new HashMap<>();
        String mostFrequent = "";
        int maxCount = 0;

        for (int i = 0; i < n - 1; i++) {
            String twoGram = s.substring(i, i + 2);
            Count.put(twoGram, Count.getOrDefault(twoGram, 0) + 1);
            if (Count.get(twoGram) > maxCount) {
                maxCount = Count.get(twoGram);
                mostFrequent = twoGram;
            }
        }

        System.out.println(mostFrequent);
    }
}