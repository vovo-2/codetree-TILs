import java.io.*;
import java.util.*;

public class BOJ1260{

    static StringTokenizer st;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static List<Integer>[] graph;
    static boolean visited[];

    static int N;

    public static void main(String[] args) throws Exception {

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int startV = Integer.parseInt(st.nextToken());
        
        graph = new ArrayList[N+1];
        visited = new boolean[N+1];
        for(int i=0;i<=N;i++){
            graph[i] = new ArrayList<>();
        }


        for(int i=0;i<E;i++){
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            
            graph[v1].add(v2);
            graph[v2].add(v1);

        }

        dfs(startV);
        visited = new boolean[N+1];
        
        System.out.println();

        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(startV);
        visited[startV]=true;

        while(!dq.isEmpty()){
            int nowV = dq.poll();
            System.out.print(nowV+" ");

            for(int i=1;i<=N;i++){
                if(!visited[i] && graph[nowV].contains(i)){
                    dq.add(i);
                    visited[i]=true;
                }
            }
        }
    }
    private static void dfs(int v) {
        System.out.print(v+" ");
        visited[v]=true;

        for(int i=1;i<=N;i++){
            if(graph[v].contains(i) && !visited[i]){
                dfs(i);
            }
        }
    }
}