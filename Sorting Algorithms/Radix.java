package practise;
import java.util.*;
public class Radix{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] +",");
        }
        System.out.println("\n");
        sort(arr, n);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] +",");
        }

    }

    public static void c_sort(int[] arr, int n, int exp){
        
        int[] count = new int[10];
        for(int i=0; i<n; i++){
          count[(arr[i]/exp)%10]++;
        }
        for(int i=1; i<10; i++){
          count[i]+=count[i-1];
        }
        int[] out = new int[n];
        for(int i=n-1; i>=0; i--){
          out[count[(arr[i]/exp)%10]-1] = arr[i];
          count[(arr[i]/exp)%10]--;
        }
        for(int i=0; i<n; i++){
          arr[i]=out[i];
        }

    }

    public static void sort(int[] arr, int n){
        int max=arr[0];
        for(int i=1; i<n; i++){
          if(max<arr[i]){
            max=arr[i];
          }
        }
        for(int exp=1; max/exp>0; exp*=10){
            c_sort(arr, n, exp);
        }
    }
}
