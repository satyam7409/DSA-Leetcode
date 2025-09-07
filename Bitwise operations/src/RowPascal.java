import java.util.ArrayList;
import java.util.List;

public class RowPascal {
    static List<Integer> getRow(int n) {
        List<Integer> row = new ArrayList<>();
        int ans = 1;
        row.add(ans);

        for (int i = 1; i <= n; i++) {
            ans = ans * (n - i + 1) / i;
            row.add(ans);
        }
        return row;
    }
    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i<n; i++){
          list.add(getRow(i));
        }
        System.out.println(list);
    }
}
