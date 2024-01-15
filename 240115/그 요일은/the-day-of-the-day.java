import java.util.*;
import java.io.*;

// System.out.println();

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception{
        int answer = 0;

        st = new StringTokenizer(br.readLine());

        int m1 = Integer.parseInt(st.nextToken());
        int d1 = Integer.parseInt(st.nextToken());

        int m2 = Integer.parseInt(st.nextToken());
        int d2 = Integer.parseInt(st.nextToken());

        String week = br.readLine();

        String[] dayOfWeek = new String[]{"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] endOfMonth = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};


        int i=0;
        while(true){

            
            if(dayOfWeek[i].equals(week)){
                answer++;
            }

            if(m1==m2 && d1==d2) break;

            i = (i+1)%7;
            d1++;
            if(endOfMonth[m1]< d1){
                d1 =1;
                m1++;
            }
            
        }

        System.out.println(answer);




    }
}