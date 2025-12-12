import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b[] = new int[256];
        int c[] = new int[256];
        int a =sc.nextInt();
        for (int i = 0; i < a; i++)
        {
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();
        }
        for (int j = 0; j < a; j++)
        {
            System.out.println("Case #" + (j + 1) + ": " +b[j]+" + "+c[j]+" = " + (b[j]+c[j]));
        }
    }
}