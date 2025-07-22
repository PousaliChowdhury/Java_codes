package Ac;
// Find the value least distance from num and divisable by m

import java.util.Scanner;

public class leastDis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int m = sc.nextInt();
        int r = num % m;

        if(r<(m+1)/2)
            System.out.println(num-r); //smaller value
        else
            System.out.println(num+m-r); //bigger value
    }
}
