import java.util.*;
import java.io.*;
//System.out.println();

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws Exception {
        int timeline1[] = new int[1000*1000+1];
        int timeline2[] = new int[1000*1000+1];
        int LEN = timeline1.length;
        
        Arrays.fill(timeline1, Integer.MAX_VALUE);
        Arrays.fill(timeline2, Integer.MAX_VALUE);
        
        int answer = -1;


        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int now_t = 0;
        timeline1[now_t] = 0;
        
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String d = st.nextToken();
            int t = Integer.parseInt(st.nextToken());
            
            
            if(d.equals("R")) {
            	for(int j=0;j<t;j++){
            		int tmp = timeline1[now_t];
            		timeline1[++now_t] = tmp+1;
            	}
            	
            }else {
            	for(int j=0;j<t;j++){
            		int tmp = timeline1[now_t];
            		timeline1[++now_t] = tmp-1;
            	}        	
            }

        }

        now_t = 0;
        timeline2[now_t] = 0;
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            String d = st.nextToken();
            int t = Integer.parseInt(st.nextToken());

            if(d.equals("R")) {
            	for(int j=0;j<t;j++){
            		int tmp = timeline2[now_t];
            		timeline2[++now_t] = tmp+1;
            	}
            	
            }else {
            	for(int j=0;j<t;j++){
            		int tmp = timeline2[now_t];
            		timeline2[++now_t] = tmp-1;
            	}        	
            }
        }
        
        for(int i=1;i<LEN;i++) {
        	if(timeline1[i]==Integer.MAX_VALUE || timeline2[i]==Integer.MAX_VALUE) continue;
        	
        	if(timeline1[i] == timeline2[i]) { 
        		answer = i ;
        		break;
        		
        	}
        }
        System.out.println(answer);
    }
}