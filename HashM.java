package Ac;
import java.util.HashMap;
import java.util.Scanner;

public class HashM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.nextLine();
        String a = s.nextLine();

        HashMap<Character, Integer> asciiMap = new HashMap<>();

        // Add ASCII values for lowercase alphabets (a to z) to the HashMap
        for (char ch = 'a'; ch <= 'z'; ch++) {
            asciiMap.put(ch, (int) ch);
        }
        
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            asciiMap.put(ch, (int) ch);
        }

        int sum = 0;
        for(int i=0; i<a.length(); i++){
            char currentChar = a.charAt(i);
            if(asciiMap.containsKey(currentChar)) {
                sum += asciiMap.get(currentChar);  // Add ASCII value to the sum
            }
        }

        System.out.println(sum);
    }
}
