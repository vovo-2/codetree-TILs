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

        List<Integer> temp = new ArrayList<>();
        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<n;i++){
            temp.add(nums[i]);
            if(i%2==0){ // 1, 3, .. 홀수번째이면
                Collections.sort(temp);
                answer.add(temp.get(i/2));
            }
        }
        for(int a:answer) System.out.print(a+" ");
    }
}