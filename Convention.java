import java.util.Scanner;

public class Convention {
    private static int N;
    private static int M;
    private static int C;
    private static int[] cows = new int[N];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        C = sc.nextInt();
        for(int i = 0; i < N; i++){
            cows[i] = sc.nextInt();
        }
    }
}
