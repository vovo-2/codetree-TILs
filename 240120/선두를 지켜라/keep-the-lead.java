import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int move[][] = new int[2][1000*1000+1];
        int now[] = new int[2];


        int target = 0;
        for(int i=0;i<n+m;i++){
            if(i<n) target =0;
            else target =1;

            st = new StringTokenizer(br.readLine());
            int v = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());

            for(int j=0;j<t;j++){
                move[target][now[target]+1] = move[target][now[target]]+v;
                now[target]++;
            }
        }

        int cnt = 0;
        int answer = 0;
        for(int i=0;i<1000*1000+1;i++){
            if(move[0][i] == move[1][i]) continue;

            if(move[0][i]<move[1][i]){
                if(target==0 && cnt!= 0) answer++;

                target = 1;
                cnt++;
            }else{
                if(target==1 && cnt!= 0) answer++;

                cnt++;
                target=0;
            }
        }

        System.out.println(answer);

    }
}