package Backtracking;

public class PrintPath {
    public static void main(String[] args) {
        int rows = 3;
        int col = 3;
        print(0,0,rows-1,col-1,"");
    }

    private static void print(int sr, int sc, int er, int ec, String s) {
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec ){
            System.out.println(s);
            return;
        }
        //down
        print(sr+1,sc,er,ec,s+"D");
        //right
        print(sr,sc+1,er,ec,s+"R");


    }
}
