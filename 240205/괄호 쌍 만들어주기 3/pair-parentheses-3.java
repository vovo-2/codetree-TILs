import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {

        st= new StringTokenizer(br.readLine());
        char[] str =st.nextToken().toCharArray();
        int N = str.length;

        int answer = 0;
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(str[i]=='(' && str[j]==')') answer++;
            }
        }

        System.out.println(answer);
    }
}