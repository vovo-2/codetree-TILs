import java.util.*;
import java.io.*;
//System.out.println();
public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String keyword = st.nextToken();

        String[] words = new String[n];
        for(int i=0;i<n;i++){
            words[i] = br.readLine();
        }

        List<String> list = new ArrayList<>();
        for(String word: words){
            if(word.startsWith(keyword)) list.add(word);
        }

        Collections.sort(list);
        String answer = list.get(k-1);
        System.out.println(answer);
    }
}