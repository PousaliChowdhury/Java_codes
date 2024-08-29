// Frequency count in a string (lowercase/ uppercase/ both)

import java.util.Scanner;

public class A12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        int n = sc.nextInt();
        sc.nextLine();
        char[] str = new char[n];

        for(int i=0; i<n; i++){
            str[i] = sc.nextLine().charAt(0);
        }
    
// --------------------------------------------------------------------------------------------------------------

//  To print in upper case and lowercase both we need 2 arr[26]
    // If not case sensitive LowerCase or UpperCase not mentioned
        // for (int i = 0; i < n; i++) {
        //     if (str[i] >= 'a' && str[i] <= 'z') {
        //         arr[str[i] - 'a'] += 1;
        //     } else if (str[i] >= 'A' && str[i] <= 'Z') {
        //         arr[str[i] - 'A'] += 1;
        //     }
        // }
// --------------------------------------------------------------------------------------------------------------

    // If case sensitive only LowerCase or UpperCase (use A)
        for (int i = 0; i < n; i++) {
            char ch = Character.toLowerCase(str[i]); 
            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a']++;  
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (arr[i] != 0) {
                char ch = (char) (i + 'a');  // Convert index back to character
                ans.append(ch);  // Append the character
                ans.append(arr[i]);  // Append the count
            }
        }

        // Repeat same thing with 'A' for uppercase, if both write twice once with 'a', another with 'A'

        System.out.println(ans.toString());
    }
}
