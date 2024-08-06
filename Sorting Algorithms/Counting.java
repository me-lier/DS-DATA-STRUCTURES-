package practise;
import java.util.*;
public class Counting{
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

    public static void sort(int[] arr, int n){
      int max=arr[0];
      for(int i=1; i<n; i++){
        if(max<arr[i]){
          max=arr[i];
        }
      }
      int[] count = new int[max+1];
      for(int i=0; i<n; i++){
        count[arr[i]]++;
      }
      for(int i=1; i<max+1; i++){
        count[i]+=count[i-1];
      }
      int[] out = new int[n];
      for(int i=0; i<n; i++){
        out[count[arr[i]]-1] = arr[i];
        count[arr[i]]--;
      }
      for(int i=0; i<n; i++){
        arr[i]=out[i];
      }
    }
}
