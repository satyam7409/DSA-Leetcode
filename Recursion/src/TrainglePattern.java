public class TrainglePattern {
    static void printTriangle(int row, int col){
        if(row == 0){
            return;
        }
        if(row>col){
            printTriangle(row,col+1);
            System.out.print("*");
        }
        else{
            printTriangle(row-1, 0);
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        printTriangle(4,0);
    }
}
