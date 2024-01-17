import java.util.*;
import java.io.*;
//System.out.println();

public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        int num[] = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) num[i] = Integer.parseInt(st.nextToken());

        int answer = 0;
        int cnt = 0;
        for(int i=0;i<n;i++){
            if(num[i]<=t) cnt=0;
            else cnt++;
            answer = Math.max(answer, cnt);
        }

        System.out.println(answer);

    }
}