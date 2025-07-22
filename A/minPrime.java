package Ac;
// Find minPrime factor of n, return n-minPrime 

import java.util.Scanner;

public class minPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int MinPrime = 2;
        while(N > 1){
            if(N % MinPrime == 0)
                break;
            else
                MinPrime++;
        }
        System.out.println(MinPrime);
        System.out.println(N-MinPrime);
    }
}
