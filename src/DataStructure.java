import com.sun.xml.internal.ws.encoding.MtomCodec;

import java.util.Arrays;
import java.util.Scanner;

public class DataStructure {

    static int maxDiff(int[]arr, int arr_length){

        int maxDiff = arr[1]-arr[0];
        int min = arr[0];
        int res = 0;
        for(int i=1;i<arr_length;i++){
            res = Math.max(res,arr[i]-min);
            min = Math.min(min,arr[i]);
        }

        return res;
    }
    public static void main(String[] args) {

        int arr[] = {2,3,10,6,4,8,1};
        int result = maxDiff(arr, arr.length);
        System.out.println(result);
    }
}
