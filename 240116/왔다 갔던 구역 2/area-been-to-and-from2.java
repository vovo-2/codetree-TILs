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
        String buffer = "";

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());

			int x = Integer.parseInt(st.nextToken());
			String order = st.nextToken();


            if(!buffer.equals("")){
                if(!buffer.equals(order)){
                    // buffer = R order= L
                    if(buffer.equals("R")) now--;
                    else now++;
                }
            }

			for(int t=0;t<x;t++){
				line[now]++;
				
				if(order.equals("R")) now++;
				else now--;
            }

            buffer = order;

		}

		int answer = 0;
		for(int j=0;j<2001;j++) {
			if(line[j]>=2) answer++;
		}
		
		System.out.println(answer);
	}
}