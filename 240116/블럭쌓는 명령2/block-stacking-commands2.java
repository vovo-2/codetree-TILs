import java.util.*;
import java.io.*;
//System.out.println();

public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int line[] = new int[n+1];

        for(int i=0;i<k;i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            while(s<=e) line[s++]++;
        }

        int answer = 0;
        for(int i=0;i<n;i++) answer = Math.max(answer, line[i]);

        System.out.println(answer);

    }
}