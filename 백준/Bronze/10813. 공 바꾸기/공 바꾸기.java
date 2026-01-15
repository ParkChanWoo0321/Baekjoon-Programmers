import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] a=new int[N];
        int temp=0;
        for(int p=1;p<=N;p++){
            a[p-1]=p;
        }
        for(int q=0;q<M;q++){
            int i=sc.nextInt();
            int j=sc.nextInt();
            temp=a[i-1];
            a[i-1]=a[j-1];
            a[j-1]=temp;
        }
        for(int z=0;z<N;z++){
            System.out.print(a[z]+" ");
        }
    }
}