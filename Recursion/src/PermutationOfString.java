public class PermutationOfString {
    static void returnPermutation(String p , String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int n = p.length();
        char ch = up.charAt(0);
        for(int i=0; i<=n; i++){
            String s= p.substring(0,i);
            String e = p.substring(i,p.length());
            returnPermutation(s+ch+e,up.substring(1));
        }
    }

    public static void main(String[] args) {
        returnPermutation("","abc");
    }
}
