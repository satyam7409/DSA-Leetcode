import java.util.Stack;
//sum of subset minimum

public class SumOfSubset {
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

    public static void main(String[] args) {
        int arr[] = {3,1,2,4};
        int nse[] = NSE(arr);
        int pse[] = PSE(arr);
        int total =0;
        for(int i =0; i<arr.length; i++){
            int right = nse[i] - i;
            int left = i - pse[i];
            total += (left * right) * arr[i];
        }
        System.out.println(total);
    }
}
