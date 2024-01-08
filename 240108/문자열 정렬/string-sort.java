import java.util.*;
import java.io.*;

// System.out.println();
public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
        String words = br.readLine();
        char[] words_array = words.toCharArray();

        Arrays.sort(words_array);

        for(char c: words_array) System.out.print(c);
	}
}