package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2562 {
    static final int COUNT = 9;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int maxNum = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0;i<COUNT;i++){
            int inputNum = Integer.parseInt(br.readLine());
            if(maxNum<inputNum){
                maxNum=inputNum;
                index = i;
            }
        }
        System.out.println(maxNum);
        System.out.println(index+1);

    }
}
