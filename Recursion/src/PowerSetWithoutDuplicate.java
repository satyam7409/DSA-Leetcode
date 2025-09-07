import java.util.ArrayList;
import java.util.List;

public class PowerSetWithoutDuplicate {
    static List<List<Integer>> retunPowerSetWithoutDuplicate(int[] nums){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for(int i=0; i< nums.length; i++){
            start=0;
            if(i>0 && nums[i]==nums[i-1]){
                start = end +1;
            }
            end= outer.size() -1;
            int n = outer.size();
            for(int j=start; j<n; j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(nums[i]);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(retunPowerSetWithoutDuplicate(arr));
    }
}
