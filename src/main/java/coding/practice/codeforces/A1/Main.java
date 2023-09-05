package coding.practice.codeforces.A1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long m = scanner.nextLong();
        long a = scanner.nextLong();

        long l = n % a == 0 ? n / a : n / a + 1;
        long b = m % a == 0 ? m / a : m / a + 1;

        System.out.println(l * b);

        scanner.close();
    }
}
