import java.util.Stack;

public class MaximalRectangle {
    public static int[][] prefixSumMatrix(int[][] matrix){
        int[][] prefixSum = new int[matrix.length][matrix[0].length];
        for(int j=0; j<matrix[0].length; j++){
            int sum = 0;
            for(int i=0; i<matrix.length; i++){
                sum += matrix[i][j];
                if(matrix[i][j]==0){
                    sum = 0;
                }
                prefixSum[i][j]=sum;
            }
        }
        return prefixSum;
    }

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

    }
}
