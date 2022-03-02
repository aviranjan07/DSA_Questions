package recursion_with_arraylist;
import java.io.*;
import java.util.*;

public class get_stair_paths {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList <String> paths = getStairPaths(n);
        System.out.println(paths);

    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n == 0) {
            ArrayList <String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        } else if (n < 0) {
            ArrayList <String> bres = new ArrayList<>();
            return bres;
        }
        ArrayList <String> pathsfromm1 = getStairPaths(n - 1);
        ArrayList <String> pathsfromm2 = getStairPaths(n - 2);
        ArrayList <String> pathsfromm3 = getStairPaths(n - 3);

        ArrayList <String> pathsfromn = new ArrayList<>();
        
        for(String pathfromm1: pathsfromm1) {
            String pathfromn = "1" + pathfromm1;
            pathsfromn.add(pathfromn);
        }
        for(String pathfromm2: pathsfromm2) {
            String pathfromn = "2" + pathfromm2;
            pathsfromn.add(pathfromn);
        }
        for(String pathfromm3: pathsfromm3) {
            String pathfromn = "3" + pathfromm3;
            pathsfromn.add(pathfromn);
        }
        return pathsfromn;

    }

}
/* 
input-
3
output
[111, 12, 21, 3]
*/