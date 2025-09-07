import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class SearchInMatrix {
 //this matrix will be sorted by row and coloum
    static int[] searchInMatrix(int arr[][], int target){
        int row =0;
        int col = arr.length -1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            } else if (arr[row][col]>target) {
                col--;
            }
            else{
                row ++;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                        {4,6,7,8},
                        {8,9,10,11}};
        int target = 7;
        System.out.println(Arrays.toString(searchInMatrix(arr,target)));
    }

}
