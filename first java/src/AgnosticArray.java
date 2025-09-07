public class AgnosticArray {
    static int binarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start]<arr[end];
        while(start <= end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc) {
                if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            }
            }
            else{
                if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={9,7,6,5,4,3,2,2,1};
        int target = 1;
        int position = binarySearch(arr,target);
        System.out.println("position:"+ position);
    }
}
