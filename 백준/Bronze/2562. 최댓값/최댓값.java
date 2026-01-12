import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[9];
        int max=0;
        int maxindex=0;
        for(int i=0;i<9;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>max){
                max=a[i];
                maxindex=i+1;
            }
        }
    System.out.println(max);
    System.out.println(maxindex);
    }
}