package coding.practice.codeforces.A231;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        int solutions = 0;

        while (T-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int knowns = 0;

            if (a == 1) knowns++;
            if (b == 1) knowns++;
            if (c == 1) knowns++;

            if (knowns >= 2) solutions++;

        }

        System.out.println(solutions);

        scanner.close();
    }
}
