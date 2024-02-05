import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        int[] humans = new int[N];
        for(int i=0;i<N;i++) {
            humans[i] = Integer.parseInt(st.nextToken());
        }

        int answer = Integer.MAX_VALUE;
        for(int from = 0; from<N; from++){
            int total = 0;
            for(int to=0;to<N;to++){
                total+= Math.abs((to-from))* humans[to];
            }

            answer = Math.min(answer, total);
        }

        System.out.println(answer);
    }
}