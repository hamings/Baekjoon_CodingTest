package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] array = new int[n];
        for(int i = 0;i<n;i++){
            array[i]=i+1;
        }
        for(int i = 0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int firstIndex = Integer.parseInt(st.nextToken())-1;
            int secondIndex = Integer.parseInt(st.nextToken())-1;
            int temp = array[firstIndex];
            array[firstIndex]=array[secondIndex];
            array[secondIndex]=temp;
        }
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
