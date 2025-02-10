public class basicSW {
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5,6, 7, 8, 9, 10};
        int k = 3;

        System.out.println(slidingWindowSum(arr,k));
    }

    public static int slidingWindowSum(int arr[], int k){
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int i = 0, j = 0;

        for (j = 0; j < k; j++){
            sum += arr[j];
        }
 
        while (j < arr.length){
            sum += arr[j];
            sum -= arr[i];
            
            maxSum = Math.max(sum, maxSum);
            i++; j++;
        }

        return maxSum;
    }
}
