import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        int m=sc.nextInt();
        int plus=sc.nextInt();
        int hplus=(m+plus)/60;
        int minute,hour = 0;
        if((m+plus)%60==0)
        {
            minute=0;
        }
        else
        {
            minute=(m+plus)%60;
        }
        if((h+hplus)%24==0)
        {
            hour=0;
        }
        else
        {
            hour=(h+hplus)%24;
        }
        System.out.println(hour+" "+minute);
    }
}