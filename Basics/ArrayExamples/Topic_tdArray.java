package ArrayExamples;
import java.util.*;

public class Topic_tdArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] TwoDimensionalArray = new int[3][3];
        // Taking inputs for the 2D-Array
        for(int row = 0; row < TwoDimensionalArray.length; row++){ 
            for(int j = 0; j <  TwoDimensionalArray[row].length; j++){ 
                TwoDimensionalArray[row][j] = sc.nextInt();
            }
        }
        // Printing the 2D-Array
        for(int row = 0; row < TwoDimensionalArray.length; row++){ 
            for(int j = 0; j <  TwoDimensionalArray[row].length; j++){ 
            System.out.print(" " + TwoDimensionalArray[row][j]);
            }
            System.out.println("\n");
        }

        for(int row = 0; row < TwoDimensionalArray.length; row++){ 
            System.out.println(Arrays.toString(TwoDimensionalArray[row]) );
        }

        System.out.println("\n");
        for (int[] is : TwoDimensionalArray) {
            System.out.println(Arrays.toString(is));
        }
        sc.close();
    }
}
