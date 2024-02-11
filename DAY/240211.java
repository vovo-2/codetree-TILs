//https://www.codetree.ai/missions/2/problems/number-of-happy-sequence/explanation

import java.io.*;
import java.util.*;
// System.out.println();
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int map[][] = new int[N][N];
        for(int y=0;y<N;y++){
            st = new StringTokenizer(br.readLine());
            for(int x=0;x<N;x++){
                map[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        //가장 최장 연속 수
        int answer=0;
        for(int i=0;i<N;i++){
            int maxRowCnt = 1;
            int maxColCnt = 1;

            int rowCnt=1;
            int colCnt=1;
            for(int j=1;j<N;j++){
                //행 [i][j]
                if(map[i][j]!=map[i][j-1]){
                    rowCnt=1;
                }else{
                    rowCnt++;
                }
                maxRowCnt = Math.max(maxRowCnt, rowCnt); 

                //열 [j][i]
                if(map[j][i]!=map[j-1][i]){
                    colCnt=1;
                }else{
                    colCnt++;
                }
                maxColCnt = Math.max(maxColCnt, colCnt); 
            }

            if(maxColCnt>=M) answer++;
            if(maxRowCnt>=M) answer++;
        }
        System.out.println(answer);
    }
}
