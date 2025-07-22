package Ac;
// Remainder mod 11
// NOTE* - string max length 1000

import java.util.Scanner;

public class Mod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        int rem = 0;

        for(int i=0; i<str.length(); i++){
            int N = rem*10 + (str.charAt(i)-'0');
            rem = N%11;
        }
        System.out.println(rem);
    }
}
