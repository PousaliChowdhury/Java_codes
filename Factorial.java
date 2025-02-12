package Ac;
//Factorial of numbers

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int fact = 1;

        for(int i=1; i<=n; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}


//  if ignore -ve is mentioned and no factors for 0 then 

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();  

        if (n == 0) { 
            System.out.println("No Factors");
            return;
        }

        int num = Math.abs(n);  // Ignore negative sign

        System.out.print("Factors of " + n + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

