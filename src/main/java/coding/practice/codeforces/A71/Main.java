package coding.practice.codeforces.A71;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        while (T-- > 0) {
            String word = scanner.next();

            if (word.length() > 10) {
                System.out.printf("%c%d%c\n", word.charAt(0), word.length() - 2, word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
            }
        }

        scanner.close();
    }
}
