package Searching;

public class BinarySearchCode {
    static int OrderAgnosticBS(int[] arr, int target){
        //Order Agnostic means assuming we don't know if the array is sorted in Ascending or Descending order.
        // So firstly we will find order then start search
        //Setting Start and end
        int start = 0;
        int end = arr.length-1;

        boolean IsAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;
            // Above mid-formula is same as mid = start+end/2.
            // Only difference is that we are doing this because in some cases value of start + end may exceed the limit Int.
            // so in that case it may throw exception. So to avoid that we are doing this.
            if (arr[mid] == target) {
                System.out.print("The index of target element is found as follow: ");
                return mid;
            }
            if (IsAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            else{
                if (target > arr[mid]) {
                    end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }

        System.out.println("Element not found ");
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= {-8,-6,-2,0,7,19,21,33,55,67,88,94,100};
        int target = 21;
        System.out.println(OrderAgnosticBS(arr,target));

    }
}
