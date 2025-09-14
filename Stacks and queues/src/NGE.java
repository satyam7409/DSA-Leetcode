//next greator elenment

import java.util.Arrays;
import java.util.Stack;

public class NGE {
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int ans[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            while(!stack.isEmpty() && arr[i]>=stack.peek()){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
                stack.push(arr[i]);
            }
            else{
                ans[i]= stack.peek();
                stack.push(arr[i]);
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
