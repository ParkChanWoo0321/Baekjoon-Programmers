import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            String s = sc.next();
            int n = s.length();

            char first = s.charAt(0);
            char last = s.charAt(n - 1);

            System.out.println("" + first + last);
        }

        sc.close();
    }
}
