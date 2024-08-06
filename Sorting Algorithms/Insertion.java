package practise;
import java.util.*;
public class Insertion{
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
       for(int i=1; i<n; i++){
        int key = arr[i];
        int j = i-1;
        while(j>=0 && key<arr[j]){
            arr[j+1] = arr[j];
            j=j-1;
        }
        arr[j+1] = key;
       }
    }
}
