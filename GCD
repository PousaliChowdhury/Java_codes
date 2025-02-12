//Iterative Approach
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        s.close();
        
        int gcd = 1;
        
        int min = Math.min(a,b);
        
        for(int i=1; i<=min; i++){
            if(a%i==0 && b%i==0) 
                gcd = i;
        }
        System.out.println(gcd);
    }
}

#OR

//Eucledian algo
import java.util.*;

class Main {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        s.close();

        System.out.println(gcd(a, b));
    }
}
