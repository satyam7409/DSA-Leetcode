public class evenOdd {
    static boolean isEven(int n){
        return (n & 1)==0;
    }
    public static void main(String[] args) {
        System.out.println(isEven(87));
    }
}
