public class CountZeros {
    static int countZeros(int n){
        int count = 0;
        while(n>0){
            if(n%10==0){
                count++;
            }
            n=n/10;
        }
        return count;
    }

    public static void main(String[] args) {
        int res = countZeros(1000);
        System.out.println(res);
    }
}
