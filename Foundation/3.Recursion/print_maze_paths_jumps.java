import java.io.*;
import java.util.*;

public class print_maze_paths_jumps {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        printMazePaths(1,1,n,m,"");
        
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String path) {
        
        if(sr==dr && sc==dc){
            System.out.println(path);
            return;
        }
        if(sr>dr || sc>dc){
            return;
        }
        
        
        for(int i=1;i<=dc-sc;i++){
            printMazePaths(sr,sc+i,dr,dc,path+"h"+String.valueOf(i));
        }
        for(int i=1;i<=dr-sr;i++){
            printMazePaths(sr+i,sc,dr,dc,path+"v"+String.valueOf(i));
        }
        int limit;
        if(sr==dr || sc==dc)limit=0;
        else limit = Math.min(dr,dc) - Math.min(sr,sc);
        for(int i=1;i<=limit;i++){
            printMazePaths(sr+i,sc+i,dr,dc,path+"d"+String.valueOf(i));
        }
        
    }

}