package Array;
import java.util.*;
public class Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enetr Array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Eneter array Elements ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Smallest Element in Array is : "+ min);
    }
    
}
