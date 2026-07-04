// Rverse array taking input from user
import java.util.*;
public class RevArray {
    public static void revArray(int a[]){
        int start = 0; 
        int end = a.length-1;
        int temp;
        while(start < end){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
        System.out.println("YOur reversed array is");
        for(int i = 0; i<a.length; i++)
        System.out.print(a[i] + " ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENter size of array");
        int size = sc.nextInt();
        int a [] = new int [size];
        System.out.println("Enter array elements");
        for(int i = 0; i<size; i++){
            a[i] = sc.nextInt();


        }
        revArray(a);
    }
    
}
