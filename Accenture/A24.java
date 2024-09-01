import java.util.*;

public class A24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalToys = sc.nextInt();
        int donatedToys = sc.nextInt();

        int remainingToys = totalToys - donatedToys;
        System.out.println(remainingToys);
    }
}
