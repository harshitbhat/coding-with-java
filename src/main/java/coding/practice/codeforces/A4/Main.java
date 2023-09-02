package coding.practice.codeforces.A4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int watermelons = scanner.nextInt();

        if (watermelons > 2 && watermelons % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
