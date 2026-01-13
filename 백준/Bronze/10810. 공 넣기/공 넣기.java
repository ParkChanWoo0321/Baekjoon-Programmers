import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] a=new int[N];
        for(int p=0;p<M;p++){
            int i=sc.nextInt();
            int j=sc.nextInt();
            int k=sc.nextInt();
            for(int q=i;q<=j;q++){
                a[q-1]=k;
            }
        }
        for(int z=0;z<N;z++){
            System.out.print(a[z]+" ");
        }
    }
}