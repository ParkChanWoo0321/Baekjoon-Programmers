import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int sec = 2;
            if (ch == 'A' || ch == 'B' || ch == 'C') sec += 1;
            else if (ch == 'D' || ch == 'E' || ch == 'F') sec += 2;
            else if (ch == 'G' || ch == 'H' || ch == 'I') sec += 3;
            else if (ch == 'J' || ch == 'K' || ch == 'L') sec += 4;
            else if (ch == 'M' || ch == 'N' || ch == 'O') sec += 5;
            else if (ch == 'P' || ch == 'Q' || ch == 'R' || ch == 'S') sec += 6;
            else if (ch == 'T' || ch == 'U' || ch == 'V') sec += 7;
            else if (ch == 'W' || ch == 'X' || ch == 'Y' || ch == 'Z') sec += 8;
            sum += sec;
        }
        System.out.print(sum);
        sc.close();
    }
}
