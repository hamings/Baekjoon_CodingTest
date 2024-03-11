package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int max = 0;
        int[] array = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0;i<count;i++){
            array[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max,array[i]);
        }
        double sum = 0;
        for (int i : array) {
            sum+=(double)i/max*100;
        }
        System.out.println(sum/count);

    }
}
