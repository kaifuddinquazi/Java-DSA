package Array;
import java.util.*;

public class SortedCheck {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter Size of Array ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Eneter Array Elements ");
    for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
     }
     for(int i=0; i< arr.length; i++){
        if(arr[i] > arr[i+1]){
            System.out.println("Not Sorted");
            break;
        }
     }
    
    }

}   

