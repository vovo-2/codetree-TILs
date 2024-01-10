import java.util.*;
import java.io.*;
//System.out.println();

class Info{
    String cal;
    String week;
    String status;
    public Info(String cal, String week, String status){
        this.cal = cal;
        this.week = week;
        this.status = status;
    }
    @Override
    public String toString(){
        return cal+" "+ week+" "+status;
    }
}
public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        int n = Integer.parseInt(br.readLine());

        List<Info> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            
            Info info = new Info(st.nextToken(), st.nextToken(), st.nextToken());
            list.add(info);
        }
        Collections.sort(list, (a,b)->a.cal.compareTo(b.cal));

        for(Info i: list){
            if(i.status.equals("Rain")){
                System.out.println(i);
                break;
            }
        }
    }
}