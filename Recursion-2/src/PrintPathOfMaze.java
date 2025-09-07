import java.util.ArrayList;

public class PrintPathOfMaze {

        static ArrayList<String> PrintPathWaysToReachInMaze(String p, int row , int col){
            if(row == 3 && col == 7){
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
            ArrayList<String> list = new ArrayList<>();

            if(row<3){
                list.addAll(PrintPathWaysToReachInMaze(p+"V",row+1,col));
            }
            if(col<7){
                list.addAll(PrintPathWaysToReachInMaze(p+"R",row,col+1));
            }
            return list;
        }

        public static void main(String[] args) {
            System.out.println(PrintPathWaysToReachInMaze("",1,1));
        }
    }

