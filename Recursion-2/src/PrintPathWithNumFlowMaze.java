import java.util.ArrayList;
import java.util.Arrays;

public class PrintPathWithNumFlowMaze {
    static void PrintAllPathsWithNums(String p,boolean[][] maze, int row,int col,int[][] path, int step){
        if(row == maze.length -1 && col == maze.length -1){
            path[row][col]=step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();

            return;
        }
        if(!maze[row][col]){
            return;
        }
        path[row][col]=step;
        //this is will set the block to the false when it comes on the way
        maze[row][col]=false;

        if(row<maze.length-1){
            PrintAllPathsWithNums(p+"D",maze,row+1,col,path,step+1);
        }
        if(col<maze[0].length-1){
            PrintAllPathsWithNums(p+"R",maze,row,col+1,path,step+1);
        }
        if(row>0){
            PrintAllPathsWithNums(p+"U",maze,row-1,col,path,step+1);
        }
        if(col>0){
            PrintAllPathsWithNums(p+"R",maze,row,col-1,path,step+1);
        }
        //this is for backtracking making the block same as true after it back through
        maze[row][col]=true;
        path[row][col]=0;

    }
    public static void main(String[] args) {
        boolean[][] maze = {{true, true,true},{true, true,true},{true, true,true}};
        int[][] path = new int[maze.length][maze[0].length];
        PrintAllPathsWithNums("",maze,0,0,path,1);
    }
}
