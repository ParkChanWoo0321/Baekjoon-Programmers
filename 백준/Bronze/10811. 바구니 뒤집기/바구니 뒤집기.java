import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[] arr=new int[N];
        for(int z=0;z<N;z++){
            arr[z]=z+1;
        }
        for(int k=0;k<M;k++){
            int i=sc.nextInt();
            int j=sc.nextInt();
            int left = i - 1;
            int right = j - 1;
            
            while (left < right) {
                int tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
                
                left++;
                right--;
            }
        }
        for(int q=0;q<N;q++){
            System.out.print(arr[q]+" ");
        }
    }
}