import java.util.*;
import java.io.*;

// System.out.println();
public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        String[] str = st.nextToken().split("");

        int n=0;
        for(int i=0;i<str.length;i++){
            n= n*2+Integer.parseInt(str[i]);
        }

        n= n*17;
        List<Integer> list = new ArrayList<>();
        while(true){
            if(n<2){
                list.add(n);
                break;
            }
            list.add(n%2);
            n = n/2;
        }

        Collections.reverse(list);

        for(int l:list) System.out.print(l);
	}
}