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

        int[] answer = new int[5];
        int i=0;

        while(true){
            if(n<k){
                answer[i++] = n;
                break;
            }

            answer[i++] = n%k;
            n = n/k;
        }

        while(i>0){
            System.out.print(answer[--i]);
        }

	}
}