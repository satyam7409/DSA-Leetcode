public class TrappinWater1 {
    public static int[] maxprefix(int[] nums){
        int ans[] = new int[nums.length];
        ans[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            ans[i] = Math.max(ans[i-1],ans[i]);
        }
        return ans;
    }

    public static int[] maxsuffix(int[] nums){
        int ans[] = new int[nums.length];
        ans[nums.length-1] = nums[nums.length-1];
        for(int i= nums.length-2; i>=0; i--){
            ans[i] = Math.max(ans[i+1],ans[i]);
        }
        return ans;
    }

    public int trap(int[] height) {
        int[] maxP = maxprefix(height);
        int[] maxS = maxsuffix(height);

        int total = 0;
        for(int i = 0; i<height.length; i++){
            int leftM = maxP[i];
            int rightM = maxS[i];
            if(leftM > height[i] && rightM > height[i]){
                total += Math.min(leftM, rightM) - height[i];
            }
        }
        return total;
    }
}
