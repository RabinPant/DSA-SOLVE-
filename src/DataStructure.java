public class DataStructure {

        public static void main(String[] args) {

            int arr[] = {2,1,0,51,6};

            int i = secondLargest(arr);
            System.out.println("The second largest number in the given array is: "+ i);

        }

        static int secondLargest(int []arr){
            int largest  = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for(int i=0;i<arr.length;i++){

                if(arr[i]>largest){
                    secondLargest = largest;
                    largest = arr[i];
                }else if(arr[i]<largest && arr[i]>secondLargest){
                    secondLargest = arr[i];
                }
                // Back Again 
            }
            return secondLargest;
        }

}
