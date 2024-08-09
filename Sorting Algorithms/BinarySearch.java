package practise;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] +",");
        }
        System.out.println("\n");
        int key = sc.nextInt();
        sc.close();

        int res = BinarySearchKey(arr, n, key);
        if(res!=-1){
            System.out.println(res);
        }else{
            System.out.println("Not found in Array");
        }

        

    }

    public static int BinarySearchKey(int[] arr, int n, int key){
        int low = 0, high = n-1;
        while(low<high){
            int mid = (low + high) / 2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }


    
}

