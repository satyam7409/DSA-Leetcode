import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NFE1LEET {

        public int[] nextGreaterElement(int[] nums1, int[] nums2) {
            Map<Integer, Integer> map = new HashMap<>(); // store NGE for nums2
            Stack<Integer> stack = new Stack<>();

            // Traverse nums2 from right to left
            for (int i = nums2.length - 1; i >= 0; i--) {
                int num = nums2[i];

                // Pop smaller or equal elements
                while (!stack.isEmpty() && stack.peek() <= num) {
                    stack.pop();
                }

                // If stack empty → no greater element
                if (stack.isEmpty()) {
                    map.put(num, -1);
                } else {
                    map.put(num, stack.peek());
                }

                // Push current number
                stack.push(num);
            }

            // Build answer for nums1
            int[] ans = new int[nums1.length];
            for (int i = 0; i < nums1.length; i++) {
                ans[i] = map.get(nums1[i]);
            }

            return ans;
        }
    }

