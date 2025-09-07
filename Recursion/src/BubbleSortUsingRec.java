public class BubbleSortUsingRec {
    static void bubbleSortByRecursion(int[] arr,int len, int index){
        if(len == 0){
            return;
        }
        if(index<len-1){
            if(arr[index]>arr[index+1]){
                int temp = arr[index];
                arr[index]=arr[index+1];
                arr[index+1]=temp;
            }
            bubbleSortByRecursion(arr,len,index+1);
        }
        else{
            bubbleSortByRecursion(arr,len-1,0);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 4, 2, 1};
        bubbleSortByRecursion(arr,arr.length,0);
        for(int i = 0 ; i< arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
