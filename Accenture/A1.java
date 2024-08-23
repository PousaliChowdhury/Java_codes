package Accenture;

import java.util.Scanner;

public class A1 {
public static int CardsPyramid(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;

        int arr[] = new int[n+1];
        
        arr[0] = 0;
        arr[1] = 2;

        for(int i=2; i<=n; i++)
            arr[i] =( 2*i + (i-1) + arr[i-1]) % 100007;

        return arr[n];
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(CardsPyramid(n));
        
    }
}
