package Ac;
// Array of Integers, find the contiguous subarray contains atlest 1 element who has the largest sum, return maxSum

import java.util.Scanner;

public class ContiguousSA {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            sum += arr[i];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0)
                sum = 0;
        }// -1 2 3 sum=-1

        System.out.println(maxSum);
    }
}
