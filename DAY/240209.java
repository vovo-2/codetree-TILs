//https://www.codetree.ai/missions/5/problems/closest-pair-of-points/submissions
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine());

        int x[] = new int[N];
        int y[] = new int[N];
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int answer = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                double result = Math.pow((x[i]-x[j]),2) + Math.pow((y[i]-y[j]),2);
                answer = Math.min(answer, (int)result);
            }
        }
        System.out.println(answer);
    }
}
