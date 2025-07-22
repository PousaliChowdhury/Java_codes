package Ac;
// Triangle 270+

public class Triangle270Up {
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
