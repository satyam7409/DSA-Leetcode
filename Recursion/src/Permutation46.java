import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation46 {
    static void Permuations(int[] nums, int index,List<List<Integer>> result){
        if(index == nums.length){
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);  // copy array elements into list
            }
            result.add(list);
        }
        for(int i=index; i<nums.length; i++){
            swap(i,index,nums);
            Permuations(nums,index+1,result);
            swap(i,index,nums);
        }
    }

     static void swap(int i, int index,int[] nums) {
        int temp =nums[i];
         nums[i]=nums[index];
         nums[index]=temp;
     }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = new ArrayList<>();
        Permuations(nums,0,result);
        System.out.println(result);
    }
}
