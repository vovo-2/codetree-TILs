import java.util.*;
import java.io.*;

// System.out.println();
public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) a[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) b[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(a);
        Arrays.sort(b);

        String answer = "Yes";
        for(int i=0;i<n;i++){
            if(a[i]!=b[i]){
                answer = "No";
                break;
            }
        }
        System.out.println(answer);

	}
}