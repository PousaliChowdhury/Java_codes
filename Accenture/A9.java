// Segregate 0 & Other numbers
// NOTE* - Should put the 0s last then other numbers
//         1) Keep the relative order of non-zero elements same
// Can do as segregate even odd but can't keep the relative order of non-zero elements same

import java.util.Scanner;

public class A9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int j = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] != 0){
                arr[j] = arr[i];
                j++;
            }
        }

        for (int i = j; i < n; i++) {
            arr[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
