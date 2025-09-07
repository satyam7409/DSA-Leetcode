import java.util.ArrayList;

public class MazeWithObstacles {
        static void PrintPathWaysToReachInMaze(String p,boolean[][] maze, int row , int col){
            if(row == 2 && col == 2){
                System.out.println(p);
                return;
            }
            if(!maze[row][col]){
                return;
            }
            if(row<2 && col<2){
                PrintPathWaysToReachInMaze(p+"D",maze,row+1,col+1);

            }
            if(row<2){
                PrintPathWaysToReachInMaze(p+"V",maze,row+1,col);
            }
            if(col<2){
                PrintPathWaysToReachInMaze(p+"R",maze,row,col+1);
            }
            return;
        }
        public static void main(String[] args) {
            boolean[][] maze = {{true, true, true},
                                {true,true,true},
                                {true,true,true  }};
            PrintPathWaysToReachInMaze("",maze,0,0);
        }
    }


