package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while(st.hasMoreTokens()){
            int newNum = Integer.parseInt(st.nextToken());
            min = Math.min(min,newNum);
            max = Math.max(max,newNum);
        }
        System.out.println(min+" "+max);
    }
}
