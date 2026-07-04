package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {2,43,1,3,102,-23,89};
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max ){
                smax = max;
                max = arr[i];
            } else if(arr[i] < max && smax < arr[i]){
                smax = arr[i];
            }
        }
        System.out.println("Largest Element is :"+ max);
         System.out.println("Secondlargest Element is :"+ smax);
    }
    
}
