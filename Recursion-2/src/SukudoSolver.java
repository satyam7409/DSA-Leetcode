public class SukudoSolver {

    public void solveSudoku(char[][] board) {
        int[][] grid = toIntGrid(board);   // Step 1: char -> int
        Solver(grid,0,0);                       // Step 2: solve using backtracking
        toCharGrid(grid, board);           // Step 3: int -> char (update original board)
    }

    //change grid in to in the integer 2d matrix
     int[][] toIntGrid(char[][] board) {
        int[][] grid = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    grid[i][j] = 0;
                } else {
                    grid[i][j] = board[i][j] - '0';
                }
            }
        }
        return grid;
    }

    //chane the int matrix to back grid matrix;

     void toCharGrid(int[][] grid, char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = (char) (grid[i][j] + '0');
            }
        }
    }

    static boolean Solver(int[][] sukodo, int row, int col){
        if (row == 9) {
//            display(sukodo);
            return true;
        }

        //check for all the
        if(col == sukodo.length){
           return Solver(sukodo,row+1,0);
        }

        //check if element already fill
        if(sukodo[row][col]!= 0){
            return Solver(sukodo,row,col+1);
        }

        for(int i = 1; i<=9; i++){
            if (isSafe(sukodo, row, col, i)) {
                sukodo[row][col]=i;
                if(Solver(sukodo, row, col+1)){
                    return true;
                }
                sukodo[row][col] = 0;
            }
        }
        return false;
    }

    private static void display(char[][] sukodo) {
        for(char[] row: sukodo){
            for(char element: row){
                System.out.print(element+ " " );
            }
            System.out.println();
        }
    }

    static boolean isSafe(int[][] sukodo, int row, int col, int num) {
        for(int i = 0; i<sukodo.length; i++){
            if(sukodo[row][i]==num){
                return false;
            }
        }

        for(int i = 0; i<sukodo.length; i++){
            if(sukodo[i][col]==num){
                return false;
            }
        }

        int startRow = row - row % 3;
        int startCol = col - col % 3;

        for(int i = startRow; i<startRow+3; i++){
            for(int j = startCol; j<startCol+3; j++){
                if(sukodo[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        SukudoSolver solver = new SukudoSolver();
        solver.solveSudoku(board);
        solver.display(board);
    }
}
