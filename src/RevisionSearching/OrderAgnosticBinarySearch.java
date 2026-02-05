package RevisionSearching;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {

        //int[] arr = {3,13,23,33,43,53,63};
          int[] arr = {63,53,43,33,23,13,3};
        int target = 23;

        int ans = binarySearch(arr, target);

        System.out.println(ans);

    }

    //Order Agnostic means assuming we don't know if the array is sorted in Ascending or Descending order.
    // So firstly we will find order then start search

    static int binarySearch(int[] arr, int target){

        int start = 0;

        int end = arr.length-1;

        boolean isAsc = arr[start] < arr[end];



        while(start <= end){

            int mid = start + (end - start)/2;

            if(target == arr[mid] ){
                return mid;
            }

            if(isAsc){
                if(target > arr[mid]){
                    start = mid +1;
                }else {
                    end = mid - 1;
                }
            } else{

                if(target < arr[mid]){
                    start = mid +1;
                }else {
                    end = mid - 1;
                }
            }


        }

        return -1;

    }




}
