import java.util.stream.*;
import java.util.*;
import java.io.*;

// System.out.println();
public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++) nums[i] = Integer.parseInt(st.nextToken());

        List<Integer> result = Arrays.stream(nums).boxed().sorted().collect(Collectors.toList());
        
        for(int num: result){
            System.out.print(num+" ");
        }

        System.out.println();

        Collections.sort(result,Collections.reverseOrder());

        for(int num: result){
            System.out.print(num+" ");
        }

        
	}
}