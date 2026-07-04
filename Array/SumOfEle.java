package Array;

public class SumOfEle {
  public static void main(String[] args) {
    int[] arr = {2,3,4,5,6,7,8};
    int sum = 0;
    int n = arr.length;
    for(int i=0; i<n; i++){
        sum += arr[i];

    }
    int avg = sum/n;
   System.out.println("Sum of Elements :"+sum);
   System.out.println("Average of Elements :"+avg);
  }  
}
