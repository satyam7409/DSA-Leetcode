public class StringCieling {
    static int stringCeiling(char arr[], char target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start+end)/2;
            if (arr[mid]<target) {
                start = mid + 1;
            } else if (arr[mid]>target) {
                end = mid -1 ;
            }
        }
        if(start == arr.length){
            return start%arr.length;
        }
        else{
            return start;
        }
    }
    public static void main(String[] args) {
        char arr[] = {'a', 'a', 'c', 'd'};
        char target = 'd';
        int position = stringCeiling(arr,target);
        System.out.println("position:"+ position);
    }
}
