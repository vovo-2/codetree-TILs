import java.util.*;
import java.io.*;

// System.out.println();
public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n*2];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n*2;i++) nums[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(nums);


        int answer = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            answer = Math.max(answer, nums[i]+nums[n*2-i-1]);
        }

        System.out.println(answer);

	}
}