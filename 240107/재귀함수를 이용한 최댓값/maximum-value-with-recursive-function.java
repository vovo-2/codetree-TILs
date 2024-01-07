import java.util.*;
import java.io.*;
// System.out.println();
public class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static int getMax(int[] nums, int n, int i){
        if(i==n) return -1;

        return Math.max(getMax(nums,n,i+1), nums[i]);
    }
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

    	int answer = getMax(nums,n,0);
        System.out.println(answer);
    }
}