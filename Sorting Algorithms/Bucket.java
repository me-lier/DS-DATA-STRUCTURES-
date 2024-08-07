import java.util.*;
public class Bucket{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] arr = new float[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextFloat();
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

    public static void ins_sort(List<Float> arr){
        int n = arr.size();
        for(int i=1; i<n; i++){
            float key = arr.get(i);
            int j = i-1;
            while(j>=0 && key<arr.get(j)){
                arr.set(j+1, arr.get(j));
                j--;
            }
            arr.set(j+1, key);
        }
    }

    public static void sort(float[] arr, int n){
        List<Float>[] buckets = new ArrayList[n];
        for(int i=0; i<n; i++){
            buckets[i] = new ArrayList<>();
        }
        for(int i=0; i<n; i++){
            buckets[(int) (n*arr[i])].add(arr[i]);
        }

        for(int i=0; i<n; i++){
            ins_sort(buckets[i]);
        }
        int index = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<buckets[i].size(); j++){
                arr[index++] = buckets[i].get(j);
            }
        }

    }
}
