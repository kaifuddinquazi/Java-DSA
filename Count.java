import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String ");
        String s = sc.nextLine();
        int vowels = 0;
        int consonant = 0;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a'|| ch =='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                vowels++;
            } else {
                consonant++;
            }
        }
        System.out.println("Number of vowels "+ vowels);
         System.out.println("Number of consonants "+ consonant);
    }
    
}
