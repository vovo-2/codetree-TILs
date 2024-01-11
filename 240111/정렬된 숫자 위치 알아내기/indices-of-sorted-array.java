import java.util.*;
import java.io.*;
//System.out.println();

class Number{
    int idx;
    int num;
    public Number(int idx, int num){
        this.idx = idx;
        this.num = num;
    }
}
public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());

        Number[] list = new Number[n];
        for(int i=0;i<n;i++){
            list[i] = new Number(i, Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(list, new Comparator<Number>(){
            @Override
            public int compare(Number n1, Number n2){
                if(n1.num == n2.num)
                    return n1.idx - n2.idx;
                return n1.num - n2.num;
            }
        });

        int[] answer = new int[n];
        for(int i=0;i<n;i++){
            answer[list[i].idx] = i+1;
        }

        for(int a:answer) System.out.print(a+" ");
    }
}