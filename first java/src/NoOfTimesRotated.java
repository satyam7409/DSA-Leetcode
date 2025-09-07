public class NoOfTimesRotated {
    static int PivotElement(int nums[]){
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(mid<end && nums[mid] > nums[mid + 1]){
                return mid+1;
            } if (mid>start && nums[mid]<nums[mid -1]) {
                return mid -1 + 1;
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
        int arr[]={1,2,3,4,5};
        int rotatedtime = PivotElement(arr);
        System.out.println("position:"+ rotatedtime);
    }
}
