import java.util.*;
import java.io.*;
//System.out.println();

public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());

        int[] num = new int[n];
        for(int i=0;i<n;i++){
            num[i] = Integer.parseInt(br.readLine());
        }

        int answer = 0;
        int cnt = 1;
        for(int i=0;i<n;i++){
            if(i==0){
                cnt=1;
            }else if( num[i]<0 && num[i-1]>0){
                cnt=1;
            }else if(num[i]>0 && num[i-1]<0){
                cnt=1;
            }else{
                cnt++;
            }

            answer= Math.max(answer, cnt);
        }
        

        System.out.println(answer);
    }
}