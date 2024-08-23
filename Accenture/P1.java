package Accenture;

public class P1 {
    public static void main(String[] args) {
        int N =7;

        for(int i = 0; i<N; i++){
            for(int j = 0; j<i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j<N-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
