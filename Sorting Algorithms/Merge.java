package practise;
import java.util.*;
public class Merge{
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

    public static void merge(int[] arr, int low, int mid, int high){
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0; i<n1; ++i){
            L[i] = arr[low + i];
        }
        for(int i = 0; i<n2; ++i){
            R[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0;

        int temp = low;

        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[temp++] = L[i++];
            }else{
                arr[temp++] = R[j++];
            }
        }

        while(i < n1){
            arr[temp++] = L[i++];
        }
        while(j < n2){
            arr[temp++] = R[j++];
        }

    }

    public static void sort(int[] arr, int low,int high){
        if(low < high){
            int mid = (low + high) / 2;
            sort(arr, low, mid);
            sort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }

    
}
