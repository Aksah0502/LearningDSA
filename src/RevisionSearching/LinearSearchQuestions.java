package RevisionSearching;

import java.util.Arrays;

public class LinearSearchQuestions {

    public static void main(String[] args) {

       /*Q.1 :
        String str = " AnuragKumar";
        char target = 'g';
        boolean ans  = searchString(str,target);
        System.out.println(ans);*/

         /* Q.2 :
         int[] arr = {1,4,7,2,9,3};
         int target = 2;
         int ans = linearSearch(arr, target, 1, 4);
        System.out.println(ans);*/

       /*Q.3 :
        int[] arr = {1,4,7,2,9,3};
       // int answer = min(arr);
        int answer = max(arr);
        System.out.println(answer);*/

        /* Q.4:
        int[][] arr = {
                {2,4,3},
                {5,9,1,7,8},
                {12,16,19}
        };
        int target = 17;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        //Why Arrays.toString() is used, as since ans is declared as array.
        // In JAVA: Arrays are objects, Printing an object directly prints its reference. Eg : System.out.println(ans); gives something like: [I@6d311334
        // Arrays.toString() loops internally and formats the elements in human-readable format. Eg : [row, col]
        */

        /*Q.5 :
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));*/

    }

    /// /////////////////////////////////////////////////////////////////////////
    /* Q.1 : Search for a character in string

    static boolean searchString(String str, char target){

//        if(str.length() == 0){
//            return false;
//        }

        if(str.isEmpty()){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {

            char element = str.charAt(i);

            if(element == target){
                return true;
            }
        }
        return false;
    }*/

    /// //////////////////////////////////////////////////////////////////////

    /* Q.2 : Search in Range

    static int linearSearch(int[] arr, int target, int start, int end){

        if(arr.length == 0){
            System.out.println("Invalid Input!! Array is Empty");
            return -1;
        }

        for (int index = start; index <= end; index++) {

            int element  = arr[index];

            if(element == target){
                return index;
            }
        }

        return -1;
    }*/

    /// /////////////////////////////////////////////////////////////////

    /* Q.3 : Find minimum/Maximum number

    //Assume array is not empty
     static int min(int[] arr){

        int ans  = arr[0];

        for(int i = 1; i< arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }

        return ans;
    }

    static int max(int[] arr){
        int ans  = arr[0];

        for(int i = 1; i< arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }

        return ans;
    }*/

    /// /////////////////////////////////////////////////////////////////

    /* Q.4: Search in 2D Array

    static int[] search(int[][] arr, int target){  //declaring function to return an array

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){

                if(arr[row][col] == target){
                    return new int[] {row, col}; // returning object of type array
                }
            }
        }

        return new int[] {-1,-1};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }*/

    /// //////////////////////////////////////////////////////////////////////

    /*Q .5: Count the numbers with even digits in array;

    static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }

        return count;
    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);

//        if (numberOfDigits % 2 == 0) {
//            return true;
//        }
//        return false;

        return numberOfDigits % 2 == 0;
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;

    }*/


}