import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SlidingWindowMax {
    public static int max(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int i =0; i<nums.length; i++){
            max = Math.max(max , nums[i]);
        }
        return max;
    }

    public static ArrayList<Integer> listOfMax(int[] nums, int k){
        ArrayList<Integer> list = new ArrayList<>();
        int start = 0;
        int end = k-1;
        while(end < nums.length){
            list.add(max(Arrays.copyOfRange(nums,start, end+1)));
            start++;
            end++;
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        ArrayList<Integer> list = listOfMax(nums, 3);
        System.out.println(list);
    }
}
