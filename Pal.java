import java.util.*;
public class Pal {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String ");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        String rev = new String(arr);
        if(s.equals(rev)){
            System.out.println("String is Palindrome ");
        } else {
            System.out.println("String is not Palindrome ");
        }
    }
}
