import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int score = sc.nextInt();
            sum += score;
            if (score > max) {
                max = score;
            }
        }
        double answer = (double) sum * 100 / max / n;
        System.out.println(answer);
    }
}