import java.util.Stack;

public class LargestAreaHistogramOPTM {
    public static int returnArea(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        for(int i = 0 ; i< nums.length; i++) {
            while (!stack.empty() && nums[stack.peek()] > nums[i]) {
                int element = nums[stack.pop()];
                int nse = i;
                int pse = stack.empty() ? -1 : stack.peek();
                max = Math.max((nse - pse -1)*element, max);
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            int nse = nums.length;
            int element = nums[stack.pop()];
            int pse = stack.empty() ? -1 : stack.peek();
            max = Math.max((nse - pse -1)*element, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,5,6,2,3};
        System.out.println(returnArea(nums));
    }
}
