import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] a=new int[42];
        int j=0;
        for(int i=0;i<10;i++){
            int b=sc.nextInt();
            a[b%42]++;
        }
        for(int i=0;i<42;i++){
            if(a[i]!=0){
                j++;
            }
        }
        System.out.println(j);
    }
}