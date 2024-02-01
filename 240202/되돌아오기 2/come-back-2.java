import java.util.*;
import java.io.*;
//System.out.println();

public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int dx[] = {0, 1, 0, -1}; //북동남서
    static int dy[] = {1, 0, -1, 0};
    static int now_d = 0;
    static int x =0, y=0;
    public static void main(String[] args) throws Exception {
        char[] orders = br.readLine().toCharArray();
        int answer =0;
        boolean is_find=false;

        for(char order: orders){


            if(order=='F'){
                x = x+ dx[now_d];
                y = y+ dy[now_d];
            }else if(order=='L'){
                if(now_d==0) {
                    now_d=3;
                }else{
                    now_d--;
                }
            }else{ //R
                now_d = (now_d+1)%4;
            }
            
            answer++;
            if(x==0 && y==0) {
                is_find=true;
                break;
            }

        }
        if(!is_find) answer= -1;
            System.out.println(answer);

        
    }
}