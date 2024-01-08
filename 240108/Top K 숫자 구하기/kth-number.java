import java.util.*;
import java.io.*;

// System.out.println();
public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] nums = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) nums[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(nums);
        System.out.println(nums[k-1]);

	}
}