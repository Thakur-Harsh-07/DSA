package Backtracking;

public class FourDirectionMazePAth {
    public static void main(String[] args) {
        int rows = 3;
        int col = 3;
        boolean[][] isVisited = new boolean[rows][col];
        print(0,0,rows-1,col-1,"", isVisited);
    }
    private static void print(int sr, int sc, int er, int ec, String s, boolean[][] isVisited) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(isVisited[sr][sc]) return;
        if(sr==er && sc==ec ){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        //down
        print(sr+1,sc,er,ec,s+"D",isVisited);
        //right
        print(sr,sc+1,er,ec,s+"R", isVisited);
        // left
        print(sr,sc-1,er,ec,s+"L", isVisited);
        // up
        print(sr-1,sc,er,ec,s+"U", isVisited);
//        backtracking
        isVisited[sr][sc] = false;


    }
}
