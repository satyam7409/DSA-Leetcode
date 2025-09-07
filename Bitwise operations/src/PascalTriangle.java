import java.util.ArrayList;

public class PascalTriangle {
    static int elementAtRowCol(int r , int c){
         r = r-1;
         c = c-1;
        int ans = factorial(r) / (factorial(c) * factorial(r - c));
        return ans;
    }
    static int factorial(int num){
        int fact = 1;
        while(num>0){
          fact *= num;
          num--;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n = 4;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 1; i<=n; i++){
            ArrayList<Integer> row = new ArrayList<Integer>();

            for(int j = 1; j<=i; j++){
                row.add(elementAtRowCol(i,j));
            }
            list.add(row);
        }
        for(ArrayList<Integer> row : list){
            System.out.println(row);
        }
    }
}
