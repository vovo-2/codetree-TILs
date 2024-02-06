import java.io.*;
import java.util.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception{

        int N = Integer.parseInt(br.readLine());
        
        // 하나의 점을 뺀 뒤
        // 나머지 점들의 x의 최소, 최대, y의 최소,최대 하기
        // 차이만큼 곱해

        int x[] = new int[N];
        int y[] = new int[N];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            y[i] = Integer.parseInt(st.nextToken());
            x[i] = Integer.parseInt(st.nextToken());
        }

        int answer = Integer.MAX_VALUE;
        for(int except=0; except<N; except++){
            int maxX=1;
            int maxY=1;

            int minX = Integer.MAX_VALUE;
            int minY = Integer.MAX_VALUE;

            for(int i=0;i<N;i++){
                if(except==i) continue;

                maxX = Math.max(maxX, x[i]);
                maxY = Math.max(maxY, y[i]);
                minX = Math.min(minX, x[i]);
                minY = Math.min(minY, y[i]);
            }
            answer = Math.min(answer, (maxX-minX)*(maxY-minY));

        }
        System.out.println(answer);



    }
}