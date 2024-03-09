package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[201];
        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            array[Integer.parseInt(st.nextToken())+100]++;
        }

        int findIndex = Integer.parseInt(br.readLine());
        System.out.println(array[findIndex+100]);
    }
}
