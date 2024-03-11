package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q3052 {
    static final int NUMBER_TO_DIVIDE = 42;
    static final int INPUT_COUNT = 10;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        int[] array = new int[NUMBER_TO_DIVIDE];

        for(int i=0;i<INPUT_COUNT;i++){
            int inputNum = Integer.parseInt(br.readLine());
            if(array[inputNum%NUMBER_TO_DIVIDE]!=0){
                continue;
            }
            array[inputNum%NUMBER_TO_DIVIDE]++;
            result++;
        }
        System.out.println(result);
    }
}
