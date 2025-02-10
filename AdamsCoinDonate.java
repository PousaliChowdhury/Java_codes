package Ac;
// Starting from today as Day 1 adams start doneting coins, he will give i^2 coins at ith day, Calculate totalCoins

import java.util.Scanner;

public class AdamsCoinDonate {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int totalCoins = 0;

        for(int i=0; i<=n; i++){
            totalCoins += i*i;
        }

        System.out.println(totalCoins);
    }
}
