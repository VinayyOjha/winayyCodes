package ArrayExamples;
// String[] arr1 = new String[5]; // This is an ARRAY OF OBJECTS. Meomory is dynamicllay allocated.


import java.util.*;

public class arr {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr2 = new int[5];

        for (int i = 0; i < arr2.length; i++){
            arr2[i] = in.nextInt();
        }
        System.out.println("\nThe array is: \n");

        // IMP : FOR EACH LOOP 
        for (int j  : arr2)/// for every element in array , print the element. 
        {
            System.out.println(j);
        }
        System.out.println(Arrays.toString(arr2));
        in.close();
    }
}
