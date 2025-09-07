public class RoatedSortedArray {
    static int RotatedSearch(int nums[], int target){
        int pivot = PivotElement(nums);
        if(pivot == -1){
            return binarysearch(nums,target,0,nums.length-1);
        }

        if(nums[pivot] == target){
            return pivot;
        }
        
        else if (target>=nums[0]) {
            return binarysearch(nums, target, 0, pivot-1);
        }
        else{
            return binarysearch(nums, target, pivot+1 , nums.length -1);
        }
    }
    static int binarysearch(int[] nums, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid]<target) {
                start = mid + 1;
            } else if (nums[mid]>target) {
                end = mid -1 ;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int PivotElement(int nums[]){
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid<end && nums[mid] > nums[mid + 1]){
                return mid;
            } if (mid>start && nums[mid]<nums[mid -1]) {
                return mid -1;
            }  if (nums[start]<= nums[mid]) {
                start = mid +1;
            }
            else{
                end = mid -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={6,7,10,11,34,55,88,9,1,2,2,2,3};
        int target = 2;
        int position = RotatedSearch(arr, target);
        System.out.println("position:"+ position);
    }
}
