import java.util.*;
import java.io.*;
//System.out.println();

class Agent implements Comparable<Agent>{
    String codename;
    int score;

    public Agent(String codename, int score){
        this.codename = codename;
        this.score = score;
    }

    @Override
    public String toString(){
        return codename+" "+score;
    }

    @Override
    public int compareTo(Agent a){
        return Integer.compare(this.score, a.score);
    }
}
public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {

        List<Agent> list = new ArrayList<>();
        
        for(int i=0;i<5;i++){
            st = new StringTokenizer(br.readLine());
            String cd = st.nextToken();
            int sc = Integer.parseInt(st.nextToken());

            list.add(new Agent(cd,sc));

        }

        Collections.sort(list);

        System.out.println(list.get(0).toString());
    }
}