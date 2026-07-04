import java.util.*;
public class RevArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Size of Array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Reversed Array is :");
        for(int ele : arr){
            System.out.print(ele+ " ");
        }
        
    }
}
