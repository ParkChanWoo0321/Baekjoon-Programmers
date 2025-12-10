import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int allmoney=0;
        int money=sc.nextInt();
        int count=sc.nextInt();
        for(int i=0;i<count;i++){
            int money1=sc.nextInt();
            int count1=sc.nextInt();
            allmoney+=(money1*count1);
        }
        if(allmoney==money)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}