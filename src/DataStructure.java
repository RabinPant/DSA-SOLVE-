import java.util.Arrays;

public class DataStructure {

       public static void main(){
            int arr[] = {1,2,3,4,5,6,7};

            rotate(arr,3);
       }

       public static void rotate(int[] nums, int k){
           
           k = k% nums.length;
           reverse(nums,0,nums.length-1);
           reverse(nums,0,k-1);
           reverse(nums,k,nums.length-1);

           System.out.println(Arrays.toString(nums));
       }

       static void reverse(int[]nums, int start, int end){

           while(start < end){
               int temp = nums[start];
               nums[start] = nums[end];
               nums[end]=temp;
               start++;
               end--;
           }
       }

}
