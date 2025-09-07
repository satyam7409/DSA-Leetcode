public class NumberOfDiceRolls {
    static void printSUm(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i<=6 && i<=target; i++){
            printSUm(p+i,target-i);
        }
    }

    public static void main(String[] args) {
        printSUm("",4);
    }
}
