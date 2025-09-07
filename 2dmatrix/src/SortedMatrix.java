import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int arr[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int target = 8;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] binarySearch(int[][] arr, int row, int cStart, int cEnd, int target){
        int mid = cStart + (cEnd-cStart) / 2;
        while(cStart<=cEnd) {
            if (arr[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (arr[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int arr[][], int target){
        int rows = arr.length;
        int cols = arr[0].length;
        if(cols==0){
            return new int[]{-1,-1};
        }
        if (rows == 1) {
            return binarySearch(arr,0, 0, cols-1, target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;
        while(rStart<(rEnd-1)){
            int mid = rStart + (rEnd - rStart) / 2;
            if(arr[mid][cMid]==target){
                return new int[]{mid , cMid};
            }
            if(arr[mid][cMid]>target){
                rEnd = mid;
            }
            else{
                rStart = mid;
            }
        }
        //search in col in rstart row
        if(arr[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }

        //search in col in rend row
        if(arr[rEnd][cMid]==target){
            return new int[]{rEnd,cMid};
        }

        if (target <= arr[rStart][cMid - 1]) {
            return binarySearch(arr, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols - 1]) {
            return binarySearch(arr, rStart, cMid + 1, cols - 1, target);
        }
        // search in 3rd half
        if (target <= arr[rStart + 1][cMid - 1]) {
            return binarySearch(arr, rStart + 1, 0, cMid-1, target);
        } else {
            return binarySearch(arr, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}
