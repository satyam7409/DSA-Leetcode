import java.util.Scanner;

public class Twodimenionalarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size for row");
        int row = sc.nextInt();
        System.out.println("enter the size for col");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println("enter the value for :");
                arr[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println(arr[i][j]);
            }

        }
    }
}
