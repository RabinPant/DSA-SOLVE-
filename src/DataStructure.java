import java.util.Arrays;

public class DataStructure {

    public static void main(String[] args) {
        int arr[] = {4,2,1};

        boolean b = checkPossibility(arr);

        System.out.println(b);
    }
       public static boolean checkPossibility(int []arr){

           boolean changed = false;

           for(int i=0;i<arr.length-1;i++){

               if(arr[i]<=arr[i+1]){
                   continue;
               }
               if(changed)
                   return false;
               if(i==0 || arr[i+1]>=arr[i-1])
                   arr[i] = arr[i+1];
               else
                   arr[i+1] = arr[i];

               changed = true;
           }

           return true;
       }
}
