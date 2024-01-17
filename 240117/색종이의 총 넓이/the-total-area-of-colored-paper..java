import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        int map[][] = new int[201][201];

        int n = Integer.parseInt(br.readLine());

        for(int t=0;t<n;t++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken())+100;
            int y = Integer.parseInt(st.nextToken())+100;

            for(int i=x;i<x+8;i++){
                for(int j=y;j<y+8;j++){
                    map[j][i] = 1;
                }
            }

        }

        int answer=0;
        for(int i=0;i<201;i++){
            for(int j=0;j<201;j++) {
                if(map[j][i]==1) answer++;
            }
        }

        System.out.println(answer);
    }
}