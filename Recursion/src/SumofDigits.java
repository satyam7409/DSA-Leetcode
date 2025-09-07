public class SumofDigits {
    static int fun(int n){
        int sum = 0;
        while(n>0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    static int sunRecursion(int n){
        if(n<=0){
            return 0;
        }
        return n%10 + sunRecursion(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sunRecursion(22345));
    }
}
