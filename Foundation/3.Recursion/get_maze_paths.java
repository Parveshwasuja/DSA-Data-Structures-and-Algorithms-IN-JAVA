import java.io.*;
import java.util.*;

public class get_maze_paths {

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
        if(sr>dr || sc>dc){
            ArrayList<String> a = new ArrayList<>();
            return a;
        }
        
        ArrayList<String> hl = getMazePaths(sr,sc+1,dr,dc);
        ArrayList<String> vl = getMazePaths(sr+1,sc,dr,dc);
        
        ArrayList<String> nl = new ArrayList<>();
        
        for(String i : hl){
            nl.add('h'+i);
        }
        for(String i : vl){
            nl.add('v'+i);
        }
        return nl;
        
    }

}