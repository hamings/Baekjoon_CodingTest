package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        int n = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);

        int[] nums = new int[n];
        for(int i = 0;i<nums.length;i++){
            nums[i]=i+1;
        }
        for(int i = 0;i<m;i++){
            strings = br.readLine().split(" ");
            int start = Integer.parseInt(strings[0])-1;
            int end = Integer.parseInt(strings[1])-1;
            for(int j = 0;j<=(end-start)/2;j++){
                int temp = nums[end-j];
                nums[end-j]=nums[start+j];
                nums[start+j]=temp;
            }
        }
        for (int num : nums) {
            System.out.print(num+" ");
        }



    }
}
