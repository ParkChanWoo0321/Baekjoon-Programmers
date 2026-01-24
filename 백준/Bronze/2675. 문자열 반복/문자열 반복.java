import java.util.Scanner;

public class Main {
    static void repeatLetter(int a, String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < a; j++) {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int a = sc.nextInt();
            String s = sc.next();
            repeatLetter(a, s);
        }
        sc.close();
    }
}