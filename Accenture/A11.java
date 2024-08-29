// Numbers Puzzle 
// NOTE* - 1) Sort any order
//         2) Find how much minimum penalty need to pay 
//         3) Penalty = sum of absolute differences between adjacent number

import java.util.*;

public class A11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        
    // To make the array sort in decending order
        // for (int i = 0; i < n / 2; i++) {
        //     int temp = arr[i];
        //     arr[i] = arr[n - 1 - i];
        //     arr[n - 1 - i] = temp;
        // }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int sum = 0;

        for (int i = 1; i < n; i++) {
            sum += Math.abs(arr[i]-arr[i-1]); //abs = absolute difference of adjacent
        }

        System.out.println(sum);
    }
}
