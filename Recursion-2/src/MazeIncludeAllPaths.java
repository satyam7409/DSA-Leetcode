public class MazeIncludeAllPaths {
    static void PrintAllPaths(String p,boolean[][] maze, int row,int col){
        if(row == maze.length -1 && col == maze.length -1){
            System.out.println(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }

        //this is will set the block to the false when it comes on the way
        maze[row][col]=false;

        if(row<maze.length-1){
          PrintAllPaths(p+"D",maze,row+1,col);
        }
        if(col<maze[0].length-1){
            PrintAllPaths(p+"R",maze,row,col+1);
        }
        if(row>0){
            PrintAllPaths(p+"U",maze,row-1,col);
        }
        if(col>0){
            PrintAllPaths(p+"R",maze,row,col-1);
        }
        //this is for backtracking making the block same as true after it back through
        maze[row][col]=true;
    }
    public static void main(String[] args) {
        boolean[][] maze = {{true, true,true},{true, true,true},{true, true,true}};
        PrintAllPaths("",maze,0,0);
    }
}
