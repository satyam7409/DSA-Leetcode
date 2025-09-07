public class RemoveChars {
    static String remnoveChar(String str){
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            if(character != 'a'){
                newStr.append(character);}
        }
        return newStr.toString();
    }
    static void removeByPassingRecursion(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch=='a'){
            removeByPassingRecursion(p,up.substring(1));
        }
        else{
           removeByPassingRecursion(p+ch,up.substring(1));
        }
    }
    static String byReturnSkip(String str) {
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0);
        if(ch =='a'){
            return byReturnSkip(str.substring(1));
        }
        else{
            return ch + byReturnSkip(str.substring(1));
        }
    }
    public static void main(String[] args) {
        String str = "bccdabab";
        System.out.println(byReturnSkip(str));

    }
}
