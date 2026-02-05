package Searching;

public class BinarySearchQuestions {
    //Q.1: Find the ceiling index of a number (this means we need to find the smallest element greater than or equal to the target element).
    static int CeilingOfaNumber(int[] arr, int target){
        // checking if the greatest element in the array is greater then target
        if(target > arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        //Doing this will ensure that this program is applied to both ascending and descending order.
        boolean IsAsc = arr[start] < arr[end];
        while(start<=end){
            int mid = start + (end-start)/2;

            if(IsAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                }
                else if(target<arr[mid])  {
                    end = mid - 1;
                }else{
                    return mid;
                }
            }
            else{
                if (target > arr[mid]) {
                    start = mid - 1;
                }
                else if(target<arr[mid]){
                    end = mid + 1;
                }else{
                    return mid; //target found
                }

            }

        }
        return start;

    }
    /* Q.2: Find the floor index of a target element(greatest element smaller than the target element)
    //whole code is same , just return end instead of start;

    static int Hello(int[] arr, int target){
       int start = 0;
       int end = arr.length-1;

        // Check if the end index is valid, i.e., if there exists an element smaller than the target
        if (end < 0) {
            System.out.println("No element smaller than the target.");
            return -1;  // No valid element found
        }

       while(start<=end){
           int mid = start + (end-start)/2;
           if(target>arr[mid]){
               start = mid+1;
           }
           else if(target<arr[mid]){
               end=mid-1;
           }else{
               return mid;//found
           }
       }

       return end;
    }*/

    //Q.3: Find the largest character greater than target character.
    // To solve this copy-paste same binary code,then remove the target=mid-part and at last return the start%arr.length
    // this will ensure that if no element is greater than target element then it returns first element of array.

    /* Q.4: Find the starting and ending position of a
     target element in a given sorted array in ascending order.
    static int FirstOcc(int[] arr, int target) {
        int FirstPos = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if(target== arr[mid]){
                FirstPos = mid;
                end = mid-1;
            }
        }
        return FirstPos;
    }

    static int LastOcc(int[] arr, int target) {
        int LastPos = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            if(target== arr[mid]){
                LastPos = mid;
                start = mid+1;
            }
        }
        return LastPos;
    }

    // if the question is asking for result in ans(a,b) format then the code will be:
    public int[] Search(int[]arr, int target) {

        int[] ans = {-1, -1};
        int start = FindingOccur(arr,target,true);
        int end = FindingOccur(arr,target,false);

        ans[0] = start;
        ans[1] = end;
        return ans;

    }
        int FindingOccur ( int[] arr, int target, boolean find){
            int ans = -1;
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    ans = mid;
                    if(find){
                        end = mid-1;
                    }
                    else{
                        start = mid+1;
                    }
                }
            }
            return ans;

        }*/

    /*Q.5: Find the element in Infinite Sorted Array
    static int ans(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target > arr[end]) {
            int temp = end + 1; // this is my new start
            // double the box value
            // end = previous end + sizeofbox*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);

    }
    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }*/

    /*Q.6: Find the Peak Index of Mountain Array(Also known as bitonic array).
    //A mountain array is a type of array which is firstly in ascending order then reaches a peak(Max. Value) then in descending order.
    //Eg: [1,5,6,7,8,6,4,3,2]. Also there is no repetition of element in Peak Mountain Array.
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }*/


    /*Q.7: Find the target in Mountain Array. So firstly fond the peak then apply BS from start to peak.
    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
        }

        return start; // or return end as both are =
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }*/


    /*Q.8: Search in Rotated Sorted Array & Q.9: Search in Rotated Sorted Array with Duplicate Element.
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    // this will not work in duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }*/

    /*Q.10: Rotation count.
    private static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    // use this for non duplicates
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // use this when arr contains duplicates
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }*/


    public static void main(String[] args) {

        int[] arr = {12,18,22,27,33,34,34,40,46,49,53,57,60,67,
                69,73,75,78,84,88,90,92,95,98,99,100};
        int target = 34;
        System.out.println("Ceiling Index of a Target element is : " + CeilingOfaNumber(arr,target));

        //Q.2: System.out.println("Value of the index greatest element smaller than target element :  " + Hello( arr, target));

        /*Q.4
        BinarySearchQuestions obj = new BinarySearchQuestions();
        System.out.print("Position of first and last index : ");
        int[] result = obj.Search(arr, target);

        // Print the result in the desired format
        System.out.println("ans(" + result[0] + ", " + result[1] + ")");*/
    }
}
