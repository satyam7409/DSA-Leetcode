public class Factors {
    static void printFactors(int n){
        for(int i=1; i<Math.sqrt(n); i++){
            if(n%i==0){
                System.out.println(i);
                System.out.println(n/i);
            }
        }
    }

    public static void main(String[] args) {
        int n = 40;
        printFactors(n);
    }
}
