import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        int n = Integer.parseInt(br.readLine());
        int[] answer = new int[17];
        int i = 0;

        while(true){
            if(n<2){
                answer[i++] = n;
                break;
            }
            answer[i++] = n%2;
            n = n/2;
        }

        while(i>0){
            System.out.print(answer[--i]);
        }

    }

}