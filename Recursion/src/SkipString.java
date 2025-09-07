public class SkipString {
    static String SkipString(String str){
        if(str.isEmpty()){
            return "";
        }
        if(str.startsWith("apple")){
            return SkipString(str.substring(5));
        }
        else{
            return str.charAt(0) + SkipString(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String str = "bccdabappleb";
        System.out.println(SkipString(str));
    }
}
