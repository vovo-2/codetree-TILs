import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int cnt[] = new int[N+1];

        int answer = -1;
        for(int i=0;i<M;i++){
            int target = Integer.parseInt(br.readLine());
            cnt[target]++;

            if(cnt[target]==K) {
                answer = target;
                break;
            }
        }

        System.out.println(answer);
    }
}