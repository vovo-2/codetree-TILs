import java.util.*;
import java.io.*;

// System.out.println();
public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static int func(int[] nums, int n, int now) {
		if(now==0) return Integer.MAX_VALUE;
		
		boolean check = true;

		for (int i = 0; i < n; i++) {
			if (now % nums[i] != 0) {
				check = false;
				break;
			}
		}

		if (check)
			return Math.min(now, func(nums, n, now - 1));
		else
			return Math.min(Integer.MAX_VALUE, func(nums, n, now - 1));

	}

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());

		int[] nums = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			nums[i] = Integer.parseInt(st.nextToken());

		int total = 1;
		for (int i = 0; i < n; i++)
			total *= nums[i];

		int answer = func(nums, n, total);
		System.out.println(answer);
	}
}