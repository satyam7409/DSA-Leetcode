public class FindInMountain {
    static int ElmentInMountain(int arr[], int target){
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        int peak = start;
        // start == end is the peak
        int index = binarySearch(arr,target,true, 0 , peak);
        if(index == - 1){
             index = binarySearch(arr, target, false, peak+1, arr.length-1 );
        }
        return index;
    }
    static int binarySearch(int arr[], int target, boolean isAsc,int start, int end){
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
        int arr[]={1,2,3,4,6,4,3,1};
        int target = 1;
        int position = ElmentInMountain(arr,target);
        System.out.println("position:"+ position);
    }
}
