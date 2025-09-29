package Backtracking;

//import static Recursion.MazePath.maze;

public class MazePath {
    public static int maze(int sr, int sc, int er, int ec){
        if(sr>er || sc>ec) return 0;
        if(sr==er || sc==ec) return 1;
        int down = maze(sr+1,sc,er,ec);
        int right = maze(sr,sc+1,er,ec);
        return down+right;
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int count = maze(1,1,row,col);
        System.out.println(count);

    }
}
