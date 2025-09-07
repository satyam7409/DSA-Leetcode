import java.util.ArrayList;
import java.util.List;

public class NqueensPrint {
    static int Nqueens(boolean[][] board, int row, List<List<String>> result){
        if(row == board.length){
            display(board,result);
            return 1;
        }
        int count = 0;
        for(int col = 0; col<board.length; col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                count+=Nqueens(board,row+1,result);
                board[row][col]=false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if(board[row-i][col+i]) {
                return false;
            }
        }

        return true;
    }

    static void display(boolean[][] board,List<List<String>> result) {
        List<String> list = new ArrayList<>();
        for(boolean[] row : board) {
            StringBuilder str = new StringBuilder();
            for(boolean element : row) {
                if (element) {
                    str.append("Q");
                } else {
                    str.append(".");
                }
            }
            list.add(str.toString());
        }
        result.add(list);
    }

    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        List<List<String>> result = new ArrayList<>();
        Nqueens(board, 0,result);
        System.out.println(result);
    }
}
