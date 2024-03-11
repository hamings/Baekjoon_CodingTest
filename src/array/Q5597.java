package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5597 {
    static final int STUDENT_NUM = 30;
    public static void main(String[] args) throws IOException {
        boolean[] check = new boolean[STUDENT_NUM];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0;i<STUDENT_NUM-2;i++){
            int index = Integer.parseInt(br.readLine());
            check[index-1]= true;
        }
        for(int i = 0;i<STUDENT_NUM;i++){
            if(!check[i]){
                System.out.println(i+1);
            }
        }
    }
}
