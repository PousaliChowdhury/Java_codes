package Ac;
// A rod comprising Positive & Negetive charge P & N respectively, Calculate max net electrostatic field(EF) possible in the region due to the rod

import java.util.Scanner;

public class RodPN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr1[] = new int[n];
        char arr2[] = new char[n];

        for(int i=0; i<n; i++){
            arr1[i] = s.nextInt();
            arr2[i] = s.next().charAt(0);
        }

        int EF = 0;

        for(int i=0; i<n; i++){
            if(arr2[i] == 'P')
                EF += arr1[i];
            else if(arr2[i] == 'N')
                EF -= arr1[i];
        }

        EF = Math.abs(EF);
        System.out.println(EF*100);
    }
}
