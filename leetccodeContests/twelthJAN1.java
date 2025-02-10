import java.util.*;

public class twelthJAN1 {
    public static void main(String[] args) {
       System.out.print(zigzagTraversal(new int[][]{{1, 2, 3}, {4,5,6}, {7,8,9}}));
    }

    public static List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < grid.length; i++){
            if (i % 2 == 0){
                for(int j = 0; j < grid[i].length; j++){
                    list.add(grid[i][j]);
                    // System.out.print(grid[i][j] + " ");
                    j++;
                }
            }
            else {
                for(int k = grid[i].length - 1; k >= 0; k--){
                   if ((i + k) % 2 == 0) list.add(grid[i][k]); 
                }
            }
        }

        return list;
    }
}
