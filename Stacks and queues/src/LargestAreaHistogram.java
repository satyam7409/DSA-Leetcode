import java.util.Stack;

public class LargestAreaHistogram {
    public static int[] nse(int[] nums){
        int ans[] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = nums.length-1; i>=0; i--){
            while(!stack.isEmpty() && nums[stack.peek()] >= nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = nums.length;
                stack.push(i);
            }else{
                ans[i] = stack.peek();
                stack.push(i);
            }
        }
        return ans;
    }

    public static int[] pse(int[] nums){
        int ans[] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i< nums.length; i++){
            while(!stack.isEmpty() && stack.peek() > nums[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
                stack.push(i);
            }else{
                ans[i] = stack.peek();
                stack.push(i);
            }
        }
        return ans;
    }

    public static int returnLargestArea(int[] nums){
        int[] nse = nse(nums);
        int[] pse = pse(nums);
        int max = 0;
        for(int i =0; i< nums.length; i++){
            int newMax = (nse[i] - pse[i] -1) * nums[i];
            max = Math.max(max, newMax);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {2,1,5,6,2,3};
        System.out.println(returnLargestArea(nums));
    }
}
