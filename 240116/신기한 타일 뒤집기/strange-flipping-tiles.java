import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        // 여기에 코드를 작성해주세요.

        int[] line = new int[1000*100*2 +1];

        int n = Integer.parseInt(br.readLine());

        int now = 1000*100;

        String buffer = "";

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            
            int cnt = Integer.parseInt(st.nextToken());
            String order = st.nextToken();

            if(!buffer.equals("") && !buffer.equals(order)){
                if(order.equals("L"))now--;
                else now++;
            }
            for(int t=0;t<cnt;t++){
                if(order.equals("R")){
                    line[now++] = 1; //검은색
                }else{
                    line[now--] = -1; //흰색
                }
            }

            buffer = order;

        }

        int white = 0;
        int black = 0;
        for(int j=0;j<line.length;j++){
            if(line[j]==0) continue;
            if(line[j]==1) black++;
            else white++;
        }

        System.out.println(white+" "+black);

    }
}