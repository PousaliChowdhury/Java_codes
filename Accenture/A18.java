// Each opening & closing braces should be balaced, if balanced then print Balanced else Compilation Error

import java.util.*;

public class A18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        Stack<Character> a = new Stack<>();

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '{')
                a.push(s.charAt(i));
            else if(s.charAt(i) == '}'){
                if (a.isEmpty()) {
                    System.out.println("compilation error");
                } else {
                    a.pop();
                }
            }
        }
        System.out.println(a.isEmpty());
    }
}
