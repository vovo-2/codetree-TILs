import java.util.*;
import java.io.*;
//System.out.println();

class Cl{
    String secretCode;
    char meetingPoint;
    int time;

    public Cl(){}

    public Cl(String s, char m, int t){
        secretCode = s;
        meetingPoint = m;
        time = t;
    }
    
    @Override
    public String toString(){
        return "secret code : "+secretCode+"\nmeeting point : "+meetingPoint+"\ntime : "+time;
    }
}
public class Main {
    static BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws Exception {
        st = new StringTokenizer(br.readLine());

        Cl temp = new Cl();
        temp.secretCode = st.nextToken();
        temp.meetingPoint = st.nextToken().charAt(0);
        temp.time = Integer.parseInt(st.nextToken());

        System.out.println(temp.toString());
        
    }
}