//next smaller element

import java.util.Arrays;
import java.util.Stack;

public class NSE {
    public static int[] NSE(int[] nums) {
        int ans[] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[i] <= stack.peek()) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
                stack.push(nums[i]);
            } else {
                ans[i] = stack.peek();
                stack.push(nums[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {4,8,5,2,25};
        int ans[] = NSE(arr);
        System.out.println(Arrays.toString(ans));
    }
}


