// program to reverse an array using while loop
public class ReverseArr {
    public static void revArray (int a []){
        int start = 0;
        int end = 5;
        int temp;
        while(start < end){
            temp =  a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;

        }
         System.out.println("Rversed array is ");
        for(int i = 0; i<a.length; i++){
            System.out.print(a[i] + " ");
            
        }
    }
    public static void main(String[] args) {
        int a [] = {20,25,50,60,12,13};
        revArray(a);
    }

}