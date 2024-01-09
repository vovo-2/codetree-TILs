import java.util.*;
import java.io.*;
//System.out.println();
 class Info{
    String id;
    int lv;

    public Info(){}
    public Info(String id, int lv){
        this.id = id;
        this.lv = lv;
    }

    @Override
    public String toString(){
        return "user "+id+" lv "+lv;
    }
}
public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());

        Info info1 = new Info("codetree", 10);
        Info info2 = new Info();
        info2.id = st.nextToken();
        info2.lv = Integer.parseInt(st.nextToken());

        System.out.println(info1);
        System.out.println(info2);

    }
}