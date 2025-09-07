import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetByRecursion {
    static List<String> printSubsets(String p, String up){
        if(up.isEmpty()){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> left =  printSubsets(p+up.charAt(0),up.substring(1));
        List<String> right = printSubsets(p,up.substring(1));

        left.addAll(right);
        return left;
    }
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        result = printSubsets("","abc");
        System.out.println(result);
    }
}
