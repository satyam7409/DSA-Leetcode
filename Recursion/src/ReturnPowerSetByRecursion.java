import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnPowerSetByRecursion {
    static void printPowerSet(List<Integer> current, int[] nums, int index){
        if(index == nums.length){
            System.out.println(current);
            return;
        }
        current.add(nums[index]);
        printPowerSet(current, nums, index+1);
        current.remove(current.size()-1);
        printPowerSet(current, nums, index+1);
    }

    public static void main(String[] args) {
        int[] nums ={1,2,3};
        printPowerSet(new ArrayList<>(), nums, 0);
    }
}
