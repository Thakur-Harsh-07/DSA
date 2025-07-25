package TwoDArray;

public class SpiralPrinting {
    public static void print(int[][] arr){
        int m = arr.length, n= arr[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,5},{4,5,6,8},{7,8,9,10}};
        int m = arr.length, n = arr[0].length;
        print(arr);
        //Spiral
        int minr =0, maxr=m-1;
        int minc =0, maxc = n-1;
        while(minr<=maxr && minc<=maxc) {
            // left to right
            for (int j = minc; j <= maxc; j++) {
                System.out.print(arr[minr][j] + " ");
            }
            minr++;
            // top to bottom
            if(minr>maxr || minc>maxc) break;
            for (int i = minr; i <= maxr; i++) {
                System.out.print(arr[i][maxc] + " ");
            }
            maxc--;
            // right to left
            if(minr>maxr || minc>maxc) break;
            for (int j = maxc; j >= minc; j--) {
                System.out.print(arr[maxr][j] + " ");
            }
            maxr--;
            // bottom to top
            if(minr>maxr || minc>maxc) break;
            for (int i = maxr; i >= minr; i--) {
                System.out.print(arr[i][minc] + " ");
            }
            minc++;
        }
    }
}
