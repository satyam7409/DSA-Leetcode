public class GCD {
    static int getGDC(int a, int b){
       while(a>0 && b>0){
           if(a>b){
               a=a%b;
           }
           else{
               b=b%a;
           }
           return (a == 0) ? b : a;
       }
       return 0;
    }

    public static void main(String[] args) {
        int result = getGDC(3,5);
        System.out.println(result);
    }
}
