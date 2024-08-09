package practise;
import java.util.*;
public class Quick{
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
        sort(arr, 0, n-1);

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] +",");
        }

    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int k = high;
        for(int i = high; i>low; i--){
            if(arr[i]>pivot){
                swap(arr, k--, i);
            }
            for(int z = 0; z < arr.length; z++){
                System.out.print(arr[z]+" ");
            }
            System.out.print("\n");
        }
        swap(arr, low, k);
        for(int z = 0; z < arr.length; z++){
            System.out.print(arr[z]+" ");
        }
        System.out.print("\n");

        return k;
    }

    public static void sort(int[] arr, int low, int high){
        if(high>low){
            int p_idx = partition(arr, low, high);

            sort(arr, low, p_idx-1);
            sort(arr, p_idx+1, high);

        }
    }
}
