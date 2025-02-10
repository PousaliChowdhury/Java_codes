package Ac;
// A string contains both upper & lower case, print the string in upper or lower case according to the count of the upper/lower case in the string
// This is using ASCII value in UorL2 same code using StringBuilder

import java.util.*;

public class UorL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        
        int upper = 0;
        int lower = 0;

        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90) // A to Z = 65 to 90
                upper++;
            else if(s.charAt(i)>=97 && s.charAt(i)<=122) // a to z = 97 to 122
                lower++;
        }

        if(lower>upper){
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i)>=65 && s.charAt(i)<=90)
                    System.out.print((char)(s.charAt(i) + 32));
                else
                    System.out.print(s.charAt(i));
            }
        }
        
        if(upper>lower){
            for(int i = 0; i<s.length(); i++){
                if(s.charAt(i)>=97 && s.charAt(i)<=122)
                    System.out.print((char)(s.charAt(i) - 32));
                else
                    System.out.print(s.charAt(i));
            }
        }

        if(upper == lower)
            System.out.print(s);
    }
}
