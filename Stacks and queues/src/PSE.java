//previos smaller element

import java.util.Arrays;
import java.util.Stack;

public class PSE {
    public static int[] PSE(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[nums.length];

        for(int i =0; i< nums.length; i++){
            while(!stack.isEmpty() && nums[i]<= stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                stack.push(-1);
                ans[i] = -1;
            }
            else{
                ans[i] = stack.peek();
                stack.push(nums[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,5,0,3,4,5};
        int ans[] = PSE(arr);
        System.out.println(Arrays.toString(ans));
    }
}
