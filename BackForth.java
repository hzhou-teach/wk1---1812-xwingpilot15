import java.util.Scanner;

public class BackForth {
    public int[] totalcases = new int[2000];
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] b1 = new int[10];
        int[] b2 = new int[10];
        for(int i = 0; i < 10; i++){
            b1[i] = sc.nextInt();
        }
        for(int i = 0; i < 10; i++){
            b2[i] = sc.nextInt();
        }
    }
}
