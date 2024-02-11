// https://www.codetree.ai/missions/2/problems/tromino/explanation
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int[][] map;
    static int answer=0;

    static boolean[][][] can = {
        {{true, false},{true, true}}// ㄴ
        , {{true, true},{true, false}}//ㄱ 뒤집어서
        , {{true,true},{false, true}}//ㄱ
        , {{false,true},{true,true}}//ㄴ 뒤집어서
        
        };

    public static void calc(int x, int y){

        for(int i=0;i<4;i++){
            int result = 0;
            for(int dy=0;dy<2;dy++){
                for(int dx=0;dx<2;dx++){
                    int ny = y+dy;
                    int nx = x+dx;

                    if(can[i][dy][dx]) result += map[ny][nx];
                }
            }
            answer = Math.max(answer, result);
        }
    }
    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //행
        int M = Integer.parseInt(st.nextToken()); //열

        map=new int[N][M];
        for(int y=0;y<N;y++){
            st = new StringTokenizer(br.readLine());
            for(int x=0;x<M;x++){
                map[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        for(int y=0;y<N;y++){
            for(int x=0;x<=M-3;x++){
                int result =0;
                for(int dx=0;dx<3;dx++){
                    result += map[y][x+dx];
                }
                answer = Math.max(answer, result);
            }
        }

        for(int y=0;y<=N-3;y++){
            for(int x=0;x<M;x++){
                int result =0;
                for(int dy=0;dy<3;dy++){
                    result += map[y+dy][x];
                }
                answer = Math.max(answer, result);
            }
        }


        for(int y=0;y<=N-2;y++){
            for(int x=0;x<=M-2;x++){
                calc(x,y);
            }
        }

        System.out.println(answer);
    }
}
