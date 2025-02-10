package basicsOfJAVA;
import java.util.Scanner;

public class powerConsumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int P1 = scanner.nextInt();
        int P2 = scanner.nextInt();
        int P3 = scanner.nextInt();
        int T1 = scanner.nextInt();
        int T2 = scanner.nextInt();

        int[] l = new int[n];
        int[] r = new int[n];

        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
        }

        int totalPowerConsumption = 0;

        for (int i = 0; i < n; i++) {
            totalPowerConsumption += (r[i] - l[i]) * P1;

            if (i < n - 1) {
                int idleTime = l[i + 1] - r[i];

                if (idleTime <= T1) {
                    totalPowerConsumption += idleTime * P1;
                } else if (idleTime <= T1 + T2) {
                    totalPowerConsumption += T1 * P1 + (idleTime - T1) * P2;
                } else {
                    totalPowerConsumption += T1 * P1 + T2 * P2 + (idleTime - T1 - T2) * P3;
                }
            }
        }

        System.out.println(totalPowerConsumption);
    }
}