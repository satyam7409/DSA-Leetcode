import java.util.AbstractList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class SlidingWindowOPM {
    public static int[] returnList(int[] nums, int k){
        Deque<Integer> deque = new ArrayDeque<>();
        int[] ans = new int[nums.length - k +1];
        int inx = 0;
        for(int i = 0; i< nums.length; i++){
            if(!deque.isEmpty() && deque.getFirst() <= i-k){
                deque.removeFirst();
            }
            while(!deque.isEmpty() && nums[deque.getLast()] <= nums[i]){
                deque.removeLast();
            }
            deque.push(i);
            if(i > k-1){
                ans[i++] = deque.getFirst();
            }
        }
        return ans;
    }
}
