public class MazeProblem {
//    static int NumberofWaysToReachInMaze(int row , int col){
//        if(row == 3 && col == 3){
//            return 1;
//        }
//        int count = 0;
//        if(row<3) {
//            count = count +NumberofWaysToReachInMaze(row + 1, col);
//        }
//        if(col<3) {
//            count = count + NumberofWaysToReachInMaze(row, col + 1);
//        }
//
//        return count;
//    }
    static  int PrintPathWaysToReachInMaze(int row , int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int left = PrintPathWaysToReachInMaze(row-1,col);
        int right = PrintPathWaysToReachInMaze(row,col-1);
        return left + right;
    }

    public static void main(String[] args) {
        int count = PrintPathWaysToReachInMaze(51,9);
        System.out.println(count);
    }
}
