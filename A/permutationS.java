package Ac;
// Display all permutation of strings without using any build in function

import java.util.Scanner;

public class permutationS {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        int len = str.length();

        int fact = 1;

        if(len == 0)
            System.out.println("1");

        for(int i=1; i<=len; i++){
            fact *= i;
        }

        System.out.println(len);
        System.out.println(fact);
    }
}
