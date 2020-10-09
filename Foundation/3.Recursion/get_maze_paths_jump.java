import java.io.*;
import java.util.*;

public class get_maze_paths_jump {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> a = getMazePaths(1,1,n,m);
        System.out.println(a);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        if(sr==dr && sc==dc){
            ArrayList<String> a = new ArrayList<>();
            a.add("");
            return a;
        }
       /* if(sr>dr || sc>dc){
            ArrayList<String> a = new ArrayList<>();
            return a;
        }**/
        
        ArrayList<String> nl = new ArrayList<>();
        for(int i=1;i<=dc-sc;i++){
            ArrayList<String> hpaths = getMazePaths(sr,sc+i,dr,dc);
            for(String j : hpaths){
                nl.add('h' + String.valueOf(i) + j);
            }
        }
        for(int i=1;i<=dr-sr;i++){
            ArrayList<String> vpaths = getMazePaths(sr+i,sc,dr,dc);
            for(String j : vpaths){
                nl.add('v' + String.valueOf(i) + j);
            }
        }
        
        int limit;
        if(sr==dr || sc==dc)limit=0;
        else limit=Math.min(dr,dc)-Math.min(sr,sc);
        
        for(int i=1;i<=limit;i++){
            ArrayList<String> dpaths = getMazePaths(sr+i,sc+i,dr,dc);
            for(String j : dpaths){
                nl.add('d' + String.valueOf(i) + j);
            }
        }
        return nl;
            
    }
    

}