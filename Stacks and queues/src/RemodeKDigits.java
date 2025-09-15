import java.util.Stack;

public class RemodeKDigits {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack<>();
       for(int i =0; i<num.length(); i++){
           while(!stack.isEmpty() && k>0 && num.charAt(i) - '0' < stack.peek() - '0'){
              stack.pop();
              k--;
           }
           stack.push(num.charAt(i));
       }
       while(k>0){
           stack.pop();
           k--;
       }
       if(stack.isEmpty()){
           return "0";
       }
       String ans = "";
       while(!stack.isEmpty()){
           ans += stack.pop();
       }

       while(ans.length()!=0 && ans.charAt(ans.length()-1) == '0'){
           ans.remove(back);
       }
       ans.reverse();
       if(ans.length() == 0){
           return '0';
       }
       else ans;
    }
