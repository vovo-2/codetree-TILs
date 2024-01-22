import java.util.*;
import java.io.*;
//System.out.println();

public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        char[] orders = br.readLine().toCharArray();

        // L: 반시계 int i = (dir-1+4)%4;
        // R: 시계방향 int i = (dir+1)%4;
        // F: x += dx[i] y+=dy[i];

        int dx[] = {0, 1, 0, -1};// 북동남서
        int dy[] = {1, 0, -1, 0};
        int dir = 0;
        int x = 0;
        int y = 0;
        for(char order: orders){
            if(order == 'L'){
                dir = (dir-1+4)%4;
            }else if(order == 'R'){
                dir = (dir+1)%4;
            }else{ // F이면
                x+=dx[dir];
                y+=dy[dir];
            }
        }

        System.out.println(x+" "+y);
    }
}