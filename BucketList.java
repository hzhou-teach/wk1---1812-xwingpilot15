//Daniel Li- Bronze 2
//Cases Passed: 10/10
//Time spent: 12 minutes

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BucketList {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("blist.in"));
        ArrayList<Integer> buckets = new ArrayList<Integer>(Collections.nCopies(1001, 0));
        int n = sc.nextInt();
        for(int cow = 0; cow < n; cow++){
            int startTime = sc.nextInt();
            int endTime = sc.nextInt();
            int bucketsNeed = sc.nextInt();
            int inbtw = endTime - startTime;
            for(int i = 0; i < inbtw + 1; i++){
                buckets.set(startTime + i, buckets.get(startTime + i) + bucketsNeed);
            }
        }
        int maxBuckets = 0;
        for(int i = 0; i < buckets.size(); i++){
            if(buckets.get(i) > maxBuckets){
                maxBuckets = buckets.get(i);
            }
        }
        PrintWriter pw = new PrintWriter(new File("blist.out"));
        pw.println(maxBuckets);
        pw.close();
    }
}
