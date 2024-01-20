import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        int[][] robot = new int[2][1_000_000+1];
        int[] now = new int[2]; // 현재 로봇의 위치

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int target = -1;
        for(int i=0;i<n+m;i++){
            if(i<n) target = 0;
            else target = 1;

            st = new StringTokenizer(br.readLine());
            int t = Integer.parseInt(st.nextToken());
            char d = st.nextToken().charAt(0);

            for(int j=0;j<t;j++){
                if(d=='L'){
                    robot[target][now[target]+1] = robot[target][now[target]] -1;
                    now[target]++;
                }else{
                    robot[target][now[target]+1] = robot[target][now[target]] +1;
                    now[target]++;
                }
            }
            

        }

        int min_robot = -1;
        int max_robot = -1;
        if(now[0]< now[1]){
            min_robot = 0;
            max_robot =1;
        }else if(now[0] > now[1]){
            min_robot = 1;
            max_robot =0;
        }
        
        if(min_robot!=-1){
            for(int i = now[min_robot]+1;i<=now[max_robot];i++){
                robot[min_robot][i] = robot[min_robot][now[min_robot]];
            }
        }

        boolean is_before_near=false;
        int answer = 0;

        for(int i=1;i<1_000_000+1;i++){
            if(i>now[0] && i>now[1]) break;
            if(robot[0][i] == robot[1][i]){
                if(is_before_near) continue;
                answer++;
                is_before_near=true;
            }else{
                is_before_near=false;
            }
        }
        System.out.println(answer);
    }
}