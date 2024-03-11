package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] array = new int[n];
        for(int i = 0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken())-1;
            int endIndex = Integer.parseInt(st.nextToken())-1;
            int num = Integer.parseInt(st.nextToken());
            for(int j = startIndex;j<=endIndex;j++){
                array[j]=num;
            }
        }
        for (int i : array) {
            System.out.print(i+" ");
        }
    }
}
