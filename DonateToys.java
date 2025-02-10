package Ac;
//  A child have some toys, he donate toys, now how many toys left?

import java.util.*;

public class DonateToys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalToys = sc.nextInt();
        int donatedToys = sc.nextInt();

        int remainingToys = totalToys - donatedToys;
        System.out.println(remainingToys);
    }
}
