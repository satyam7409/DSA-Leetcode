import java.util.Arrays;

public class Missingnumber{
    public static void main(String[] args) {
        int[] arr ={3,0,1};
        int num = missingNumber(arr);
        System.out.println(num);
        }
        static int missingNumber(int arr[]){
        cyclicSort(arr);
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=i)
            return i;
        }
        return arr.length;
        }
        static void cyclicSort(int arr[]){
            int i =0;
            while(i< arr.length){
                int correct = arr[i] ;
                if(arr[i]==arr.length){
                    i++;
                    continue;
                }
                if(arr[i]!=arr[correct]){
                    int temp = arr[correct];
                    arr[correct]=arr[i];
                    arr[i]=temp;
                }
                else{
                    i++;
                }
            }
        }

}
