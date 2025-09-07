import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr ={2,0,2,1,1,0};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static int findMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxIndex = findMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }
    static void bubbleSort(int arr[]){
        boolean swapped;
        for(int i=0; i<arr.length; i++){
            swapped = false;
            for(int j = 1; j<arr.length-i; j++){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                    swapped =true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    static void insertionSort(int nums[]){
        for (int i = 0; i < nums.length -1; i++) {
            for(int j=i+1; j>0; j--){
                if(nums[j]<nums[j-1]){
                    swap(nums,j-1,j);
                }
                else{
                    break;
                }
            }
        }
    }
}
