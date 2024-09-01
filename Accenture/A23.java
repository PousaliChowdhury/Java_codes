// A string contains both upper & lower case, print the string in upper or lower case according to the count of the upper/lower case in the string
// This is using StringBuilder in A22 same code using ASCII value

import java.util.*;

public class A23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        
        int upper = 0;
        int lower = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upper++;
            } else if (Character.isLowerCase(s.charAt(i))) {
                lower++;
            }
        }

        StringBuilder result = new StringBuilder();

        if (upper > lower) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isUpperCase(ch))
                    result.append((char) (ch + 32));
                else
                    result.append(ch);
            }
        }
        
        if (lower > upper) {
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (Character.isLowerCase(ch))
                    result.append((char) (ch - 32));
                else
                    result.append(ch);
            }
        } 
        
        if(upper == lower)
            result.append(s);
    }
}
