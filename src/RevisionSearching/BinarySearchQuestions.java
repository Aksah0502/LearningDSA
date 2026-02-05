package RevisionSearching;

public class BinarySearchQuestions {

    public static void main(String[] args) {

        //Q.1
        int[] arr = {3,13,23,33,43,53,63,73};
        int target = 43;
        int ans = binarySearch(arr, target);
        System.out.println(ans); //


        /*Q.2
        int[] arr = {3,13,23,33,43,53,63,73};
        int target = 44;
        int ans = floorOfANumber(arr, target);
        System.out.println(ans);*/

        /* Q.3 :
        char[] letter = {'a' , 'c' , 'e', 'g'};
        char target = 'g';
        char ans = nextGreatestLetter(letter, target);
        System.out.println(ans);*/


    }


    /*Q.1: Ceiling of a number.
    // [Means Find the smallest number equal to or greater than target number.
    // Example : Target = 15 . Array = {1, 4, 12, 14, 16, 19, 21}. Answer  = 16.]

    static int ceilingOfANumber(int[] arr, int target){
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
        return arr[start];
    }*/
    /// /////////////////////////////////////////////////////////////////////////////////

    /* Q.2 : Floor of a number.
    // [Meaning : Find the largest number equal to or smaller than target number.]

    static int floorOfANumber(int[] arr, int target){
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
        return arr[end];
    }*/
    /// ///////////////////////////////////////////////////////////////////////////////////

    /* Q.3 : Find-smallest-letter-greater-than-target
    // https://leetcode.com/problems/find-smallest-letter-greater-than-target/

    //Don't use static keyword on leetcode.
    public static  char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end) {
            // find the middle element
            //int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }*/
    /// ///////////////////////////////////////////////////////////////////////////////

    /*Q.4 : Find the First and Last occurrence of a number.
    // Example: arr = [3,4,5,5,6,7,7]. For target = 5, ans = [2,3]
    // LeetCode medium question.

    public int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        // check for first occurrence if target first
        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }
        return ans;
    }

    // this function just returns the index value of target
    int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }*/
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    static int binarySearch(int[] arr, int target){

        if(arr.length == 0){
            System.out.println("Array is Empty!!!!!");
            return -1;
        }

        int start = 0;
        int end = arr.length -1;

        while (start <= end){

            int mid = start + (end - start)/2;

            if(target > arr[mid]){

                start = mid +1;
            }else if(target < arr[mid]) {

                end = mid -1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}


