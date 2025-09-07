import java.util.Arrays;

public class MergeSort {
    static int[] mergeSort(int arr[]){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] newArr = new int[first.length + second.length];
        while(i< first.length && j< second.length){
            if(first[i]<second[j]){
                newArr[k]=first[i];
                i++;
                k++;
            }
            else{
                newArr[k]=second[j];
                j++;
                k++;
            }
        }
        while(i< first.length){
            newArr[k]=first[i];
            k++;
            i++;
        }

        while(j< second.length){
            newArr[k]=second[j];
            k++;
            j++;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {3,4,3,5,3,6};
        int[] result=mergeSort(arr);
        System.out.println(Arrays.toString(result));
    }
}
