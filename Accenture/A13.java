// Decrypt the string and find nth character of the decrypted string
// NOTE* - If no charecter exist at that point return -1
// To print decrypted string use StringBuilder (.toString()) and another for loop to print (if-else to print index's character)

import java.util.*;

public class A13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        int n = s.nextInt(); // find the index & return value

        int sum = 0;

        for(int i=0; i<input.length(); i+=2){
            char ch = input.charAt(i);
            int c = input.charAt(i + 1) - '0';

            sum += c;

            if(sum >= n){
                System.out.println(ch);
                return;
            }
           
        }
         System.out.println("-1");

    }
    
}

