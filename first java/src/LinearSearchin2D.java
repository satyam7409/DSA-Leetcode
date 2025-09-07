import java.util.Scanner;
public class LinearSearchin2D {
    static int LinearSearch(int arr[][], int row , int col, int target){
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(arr[i][j]==target){
                    System.out.printf("Element at: [%d][%d]%n", i, j);
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size for row: ");
        int row = sc.nextInt();
        System.out.print("enter the size for col: ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print("enter the value for :");
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.print("enter the element u want to search");
        int target = sc.nextInt();
        LinearSearch(arr, row, col , target);
    }
}
