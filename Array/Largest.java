package Array;
import java.util.*;
public class Largest {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Enetr Array Size");
        int n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("Eneter Array Elements ");
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
          
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Largest element is :"+ max);
    }
    
}
