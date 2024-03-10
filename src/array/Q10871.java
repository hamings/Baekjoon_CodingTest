package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int arraySize = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        int[] nums = new int[arraySize];
        st = new StringTokenizer(br.readLine());

        while(st.hasMoreTokens()){
            int newNum = Integer.parseInt(st.nextToken());
            if(newNum<x){
                nums[index++]=newNum;
            }
        }
        for(int i = 0;i<index;i++){
            System.out.print(nums[i]+" ");
        }

    }
}
