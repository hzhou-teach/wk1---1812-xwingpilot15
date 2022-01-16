//Daniel Li- Bronze 1
//Cases passed: 10/10
//Time spent: 15 minutes

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Mixmilk {
    public static void main(String[] args) throws FileNotFoundException{
        int[] buckets = new int[3];
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new File("mixmilk.in"));
        int limit1 = sc.nextInt();
        buckets[0] = sc.nextInt();
        int limit2 = sc.nextInt();
        buckets[1] = sc.nextInt();
        int limit3 = sc.nextInt();
        buckets[2] = sc.nextInt();
        
        //first pour
        if(buckets[1] + buckets[0] > limit2){
            int total = buckets[0] + buckets[1];
            buckets[1] = limit2;
            buckets[0] = Math.abs(limit2 - total);
        }else{
            buckets[1] = buckets[1] + buckets[0];
            buckets[0] = 0;
        }

        //second pour
        if(buckets[2] + buckets[1] > limit3){
            int total = buckets[1] + buckets[2];
            buckets[2] = limit3;
            buckets[1] = Math.abs(limit3 - total);
        }else{
            buckets[2] = buckets[2] + buckets[1];
            buckets[1] = 0;
        }

        //third pour
        if(buckets[0] + buckets[2] > limit1){
            int total = buckets[2] + buckets[0];
            buckets[0] = limit1;
            buckets[2] = Math.abs(limit1 - total);
        }else{
            buckets[0] = buckets[0] + buckets[2];
            buckets[2] = 0;
        }

        //fourth pour
        if(buckets[1] + buckets[0] > limit2){
            int total = buckets[0] + buckets[1];
            buckets[1] = limit2;
            buckets[0] = Math.abs(limit2 - total);
        }else{
            buckets[1] = buckets[1] + buckets[0];
            buckets[0] = 0;
        }

        PrintWriter pw = new PrintWriter(new File("mixmilk.out"));
        pw.println(buckets[0]);
        pw.println(buckets[1]);
        pw.println(buckets[2]);
        pw.close();
    }
}
