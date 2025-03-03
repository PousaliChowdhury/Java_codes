package Ac;
// Segregate Even & Odd numbers
// NOTE* - Should put the even numbers first then odd numbers

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int l = 0;
        int r = n-1;

        while(l<r){
            if(arr[l]%2 == 0)
                l++;
            else if(arr[l]%2 != 0){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                r--;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
