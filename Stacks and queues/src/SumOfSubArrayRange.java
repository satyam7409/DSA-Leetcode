import java.util.Stack;

public class SumOfSubArrayRange {

    public static  int[] NSE(int[] nums){
        int ans[] = new int[nums.length];
        Stack<Integer> stack = new Stack<>();

        for(int i= nums.length-1; i>=0; i--){
            while (!stack.isEmpty() && nums[i] <= nums[stack.peek()] ) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = nums.length;
                stack.push(i);
            } else {
                ans[i] = stack.peek();
                stack.push(i);
            }
        }
        return ans;
    }

    public static int[] PSE(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[nums.length];

        for(int i =0; i< nums.length; i++){
            while(!stack.isEmpty() && nums[i]< nums[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                stack.push(i);
                ans[i] = -1;
            }
            else{
                ans[i] = stack.peek();
                stack.push(i);
            }
        }
        return ans;
    }

    public static int[] nge(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[nums.length];

        for(int i = nums.length-1; i>=0; i--){
            while(!stack.isEmpty() && nums[stack.peek()]<=nums[i]){
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

    public static int[] pge(int[] nums){
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[nums.length];

        for(int i =0; i< nums.length; i++){
            while(!stack.isEmpty() && nums[i] > nums[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                stack.push(i);
                ans[i] = -1;
            }
            else{
                ans[i] = stack.peek();
                stack.push(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int greatestSum = greatestSum(nums);
        int minimumSum = minimumSum(nums);
//        return greatestSum-minimumSum;
        System.out.println(greatestSum-minimumSum);

    }

    private static int minimumSum(int[] nums) {
        int nse[] = NSE(nums);
        int pse[] = PSE(nums);
        int total =0;
        for(int i =0; i<nums.length; i++){
            int right = nse[i] - i;
            int left = i - pse[i];
            total += (left * right) * nums[i];
        }
        return total;
    }

    private static int greatestSum(int[] nums) {
        int nge[] = nge(nums);
        int pge[] = pge(nums);
        int total =0;
        for(int i =0; i<nums.length; i++){
            int right = nge[i] - i;
            int left = i - pge[i];
            total += (left * right) * nums[i];
        }
        return total;

    }
}
