import java.util.*;
import java.io.*;
//System.out.println();

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
		int[] line = new int[2001];

		int n = Integer.parseInt(br.readLine());

		int now = 1000;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			String order = st.nextToken();
			
			while (x > 0) {
				line[now]++;
				
				if(order.equals("R")) now++;
				else now--;
				
				x--;
			}
			

		}

		int answer = 0;
		for(int j=0;j<2001;j++) {
			if(line[j]>=2) answer++;
		}
		
		System.out.println(answer);
	}
}