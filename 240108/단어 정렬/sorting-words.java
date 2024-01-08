import java.util.*;
import java.io.*;

// System.out.println();
public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        
        String[] words = new String[n];
        for(int i=0;i<n;i++){
            words[i] = br.readLine();
        }

        Arrays.sort(words);

        for(String word: words) System.out.println(word);

	}
}