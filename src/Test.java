import java.util.Scanner;

/**
 * @Author: AndrewBar
 * @Date: Created in 19:06 2020/7/23
 */
public class Test {
    public static void main(String[] args) {
        //int[][] grid = new int[5][6];
        int a[][]=new int[5][5];
        int n;
        Scanner in=new Scanner(System.in);
        n=in.nextInt();
        //跳过这行换行符
        in.nextLine();
        for(int i=0;i<n;i++){
            String strLine = in.nextLine();
            Scanner s = new Scanner(strLine);
            int j=0;
            while(s.hasNextInt()){
                a[i][j++]=s.nextInt();
            }
        }
        //输出
        for( int i=0;i<n;i++){
            int j=0;
            while(a[i][j]!=0)
                System.out.print(a[i][j++]+"  ");
            System.out.println();
        }
        minPathNum(a);
    }


    public static int minPathNum(int[][] grid){

        if (grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        int m = grid.length;    //行数
        int n = grid[0].length; //列数

        int[][] num = new int[m][n];
        num[0][0] = grid[0][0];
        for (int i = 1; i < m; i++) {
            num[0][i] = grid[0][i] + num[0][i - 1];
        }

        for (int i = 1; i < n; i++) {
            num[i][0] = grid[i][0] + num[i - 1][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                num[i][j] = Math.min(num[i-1][j],num[i][j-1]) + grid[i][j];
            }
        }
        return num[m][n];
    }
}
