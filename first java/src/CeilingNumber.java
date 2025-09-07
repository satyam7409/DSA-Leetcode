public class CeilingNumber {
    static int ceilingSearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                start = mid + 1;
            } else if (arr[mid]>target) {
                end = mid -1 ;
            }
        }
        return end;
    }
    public static void main(String[] args) {
        int arr[]={2,7,11,15};
        int target = 9;
        int position = ceilingSearch(arr,target);
        System.out.println("position:"+ position);
    }
}
