import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PadNumberProblem {
        static List<String> Pad(String p, String up){
            if(up.isEmpty()){
                ArrayList<String> list = new ArrayList<>();
                if(!p.isEmpty()){
                    list.add(p);
                }
                else{
                    return list;
                }
                return list;
            }

            int digit = up.charAt(0) - '0'; //this will make "1" to 1;
            ArrayList<String> list = new ArrayList<>();
            if(digit == 7){ // pqrs (4 letters)
                for(int i = (digit - 2) * 3; i < ((digit-1) * 3) + 1; i++){
                    char ch = (char) ('a' + i);
                    list.addAll(Pad(p + ch, up.substring(1)));
                }
            }
            else if(digit == 8){ // pqrs (4 letters)
                for(int i = ((digit - 2) * 3)+1; i < ((digit-1) * 3) + 1; i++){
                    char ch = (char) ('a' + i);
                    list.addAll(Pad(p + ch, up.substring(1)));
                }
            }
            else if(digit == 9){ // wxyz (4 letters)
                for(int i = ((digit - 2) * 3) + 1; i < ((digit-1) * 3) + 2; i++){
                    char ch = (char) ('a' + i);
                    list.addAll(Pad(p + ch, up.substring(1)));
                }
            }
            else {
                for (int i = (digit - 2) * 3; i < (digit-1) * 3; i++) {
                    char ch = (char) ('a' + i);
                    list.addAll(Pad(p + ch, up.substring(1)));
                }
            }
            return list;
        }

        public static void main(String[] args) {
            System.out.println(Pad("","8"));
        }
    }


