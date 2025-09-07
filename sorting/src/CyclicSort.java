import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr ={1, 2, 2, 1, 1, 2, 2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int arr[]){
        int i =0;
        while(i< arr.length){
            int correct = arr[i] - 1;
            if(arr[i]!=arr[correct]){
                int temp = arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            }
        }
    }
}
