import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b[]=new int[1024];
        int c[]=new int[1024];
        int i=0;
        while (true)
        {
            b[i]=sc.nextInt();
            c[i]=sc.nextInt();
            if (b[i] + c[i] == 0)
            {
                break;
            }
            i++;
        }
        i = 0;
        while (true)
        {
            if (b[i] + c[i] == 0)
            {
                break;
            }
            System.out.println(b[i]+c[i]);
            i++;
        }
    }
}