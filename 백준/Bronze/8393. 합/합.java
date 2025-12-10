import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k=0;
        int i = sc.nextInt();
        for(int j=1;j<=i;j++){
            k+=j;
        }
        System.out.println(k);
    }
}