import java.util.*;
import java.io.*;
//System.out.println();

class Info{
    String productName;
    int code;

    public Info(String name, int code){
        productName = name;
        this.code = code;
    }

    @Override
    public String toString(){
        return "product "+code+" is "+productName;
    }


}
public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());
        String name = st.nextToken();
        int code = Integer.parseInt(st.nextToken());

        Info info = new Info("codetree",50);
        System.out.println(info);
        info.productName = name;
        info.code = code;
        System.out.println(info);


    }
}