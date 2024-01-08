import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws Exception {
        char[] words1 = br.readLine().toCharArray();
        char[] words2 = br.readLine().toCharArray();

        // 1. 길이 비교, 2. 문자열 비교
        String answer = "Yes";
        if(words1.length!=words2.length) answer = "No";
        else{
            Arrays.sort(words1);
            Arrays.sort(words2);

            for(int i=0;i<words1.length; i++){
                if(words1[i]!= words2[i]){
                    answer = "No";
                    break;
                }
            }
        }
        System.out.println(answer);


        // 여기에 코드를 작성해주세요.
    }
}