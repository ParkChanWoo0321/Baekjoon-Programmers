import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        char[] ac = a.toCharArray();
        char tmp = ac[0];
        ac[0] = ac[2];
        ac[2] = tmp;
        a = new String(ac);
        char[] bc = b.toCharArray();
        tmp = bc[0];
        bc[0] = bc[2];
        bc[2] = tmp;
        b = new String(bc);
        System.out.print(a.compareTo(b) > 0 ? a : b);
        sc.close();
    }
}