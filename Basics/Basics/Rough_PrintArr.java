package Basics;

public class Rough_PrintArr {

    public void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " " );
        }
    }
    public static void main(String[] args) {
        Rough_PrintArr ob = new Rough_PrintArr();
        ob.printArr(new int[] {1, 2, 3}); 
        
        /* NOTE : ANOTHER WAY:
            int[] ARR = {1, 2, 3,88};
            ob.printArr(ARR);
            System.out.println("\n");
         */
    }
}
