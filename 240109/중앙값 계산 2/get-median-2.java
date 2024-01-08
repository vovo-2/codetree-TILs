import java.util.*;
import java.io.*;
//System.out.println();
public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<n;i+=2){
            answer.add(nums[i/2]);
        }

        for(Integer num: answer) System.out.print(num+" ");

    }
}