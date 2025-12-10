import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c[] = new int[256];
        int count=sc.nextInt();
        for(int i=0;i<count;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            c[i] = a + b;
        }
        for (int j = 0; j < count; j++)
        {
            System.out.println(c[j]);
        }
    }
}