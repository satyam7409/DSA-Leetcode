public class FirstLastPosisitionElementSortedArray {
    static int[] binarySearch(int arr[], int target){
        int ans[] = {-1,-1};
        int firstIndex = SearchIndex(arr,target, true);
        int lastIndex = SearchIndex( arr,  target,  false);
        ans[0]=firstIndex;
        ans[1]=lastIndex;
        return ans;
    }
    static int SearchIndex(int arr[],int target, boolean firstIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = (start+end)/2;
             if (arr[mid]<target) {
                start = mid + 1;
            } else if (arr[mid]>target) {
                end = mid -1 ;
            }
            else{
                ans = mid;
                if(firstIndex){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,7,7,7,7,9};
        int target = 7;
        int[] position = binarySearch(arr,target);
        System.out.println("position:"+ position[0]);
        System.out.println(position[1]);
    }
}
