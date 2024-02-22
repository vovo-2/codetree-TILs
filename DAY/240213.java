// https://www.codetree.ai/missions/2/problems/gold-mining/explanation
import java.util.*;
import java.io.*;

import java.awt.Point;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N, perCost;
    static int[][] map;

    static boolean[][] visited;

    static int[] dy = {-1, 0, 0, 1}; //북서동남
    static int[] dx = {0, -1, 1, 0};

    public static boolean in_range(int x, int y){
        return 0<= x && x<N && 0<=y && y<N;
    }

    public static boolean canMining(int cnt, int k){
        return (k*k)+(k+1)*(k+1) <= perCost*cnt;
    }

    public static int getAllCnt(int x, int y){
        int result = 0;
        int k=0;
        int cnt =0;

        Deque<Point> dq = new ArrayDeque<>();
        Deque<Point> bufferDq = new ArrayDeque<>();

        dq.add(new Point(x,y));
        visited[y][x] = true;
        cnt += map[y][x];


        while(k<N*2){
            if(canMining(cnt,k)) result = Math.max(result, cnt);

            while(!dq.isEmpty()){
                Point pos = dq.poll();

                y = pos.y;
                x = pos.x;

                for(int i=0;i<4;i++){
                    int ny = y+dy[i];
                    int nx = x+dx[i];

                    if(in_range(nx,ny)&& !visited[ny][nx]){
                        bufferDq.add(new Point(nx,ny));
                        visited[ny][nx]= true;
                        cnt += map[ny][nx];
                    }
                }

            }
            k++;
            while(!bufferDq.isEmpty()){
                dq.add(bufferDq.poll());
            }
        }
        return result;
    }

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        perCost = Integer.parseInt(st.nextToken());
        map = new int[N][N];
        visited = new boolean[N][N];

        for(int y=0;y<N;y++){
            st = new StringTokenizer(br.readLine());
            for(int x=0;x<N;x++){
                map[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        int answer =0;
        for(int y=0;y<N;y++){
            for(int x=0;x<N;x++){
                visited = new boolean[N][N];
                int result = getAllCnt(x,y);
                answer = Math.max(answer, result);
            }
        }
        System.out.println(answer);
    }
}
