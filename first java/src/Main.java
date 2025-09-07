import java.sql.SQLOutput;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int linearsearch(int arr[], int target, int size){
        for(int i =0; i<size; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
          int arr[]= {1,2,3,4,5};
          int target = 3;
          int size = 5;

        int position = linearsearch(arr, target, size);
        System.out.println("position"+ position);
    }
}
