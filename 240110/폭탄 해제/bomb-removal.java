import java.util.*;
import java.io.*;
//System.out.println();

class Info{
    String code;
    String color;
    int second;

    @Override
    public String toString(){
        return "code : "+code+"\ncolor : "+color+"\nsecond : "+second;
    }
}
public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        Info info = new Info();
        info.code = st.nextToken();
        info.color = st.nextToken();
        info.second = Integer.parseInt(st.nextToken());

        System.out.println(info);
    }
}