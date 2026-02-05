package Searching;

public class LinearSearchQuestions {
    public static void main(String[] args) {

        /*Q.1:
        String sh = "AnuragKumar";
        char target = 'z';
        System.out.println(searchstring(sh,target));*/


       /*Q.2:
        int[] arr = {5,17,18,14,33,74,-6,-45, 28, 55};
        System.out.println(min(arr));*/

        /*Q.3:
        int[][] ar = {
                {1,2,3},
                {12,15},
                {6,7,8,9},
                {5,4,11}
        };

        int targetnum = 11;
        System.out.println(searching(ar,targetnum)); */


        /*Q.4:
        int[] num = {12,354,166,1000, 3, 2002};
        System.out.println(findNumbers(num));*/

        int [][] accounts = {
                {1,2,3},
                {5,1,1},
                {6,7},
                {2,3,4,5}
        };
        System.out.println(maximumWealth(accounts));
    }
    /*Q.1: Search in a string.

    static boolean searchstring(String sh, char target){

        if(sh.isEmpty()){
            return false;
        }

        for(int i = 0; i<sh.length();i++){
            if(target == sh.charAt(i)){
                System.out.print("Status of Searching of desired character : ");
                return true;
            }
        }
        System.out.print("Status of Searching of desired character : ");
        return false;

    }*/

    /* Q2: Find the minimum in the array.
    static int min(int[] arr) {
        int a = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i] < a){
                a = arr[i];
            }

        }
        System.out.print("Shortest element in the array :");
        return a;
    }*/

    /* Q.3 : Search in 2D array:
    static int searching(int[][] ar, int targetnum ){
        for(int i = 0;i<ar.length;i++){
            for(int j = 0; j<ar[i].length;j++){
                if(ar[i][j] == targetnum){
                    System.out.print("Target element found in the array : " );
                    return targetnum;
                }
            }
        }
        return -1;
    }*/

    /* Q.4: count number of digits in a number

    static int digits(int num){
        int count  = 0;

        while (num>0){
            count ++;
            num = num/10;
        }
        return count;
    }
// Checking if the digits are even or not
    static boolean even(int num){
        int NumberOfDigits = digits(num);
        if(NumberOfDigits % 2 == 0){
            return true;
        }
        return false;
        //OR
       // return NumberOfDigits % 2 ==0;
    }

    static int findNumbers(int[] num){
        int count = 0;
        for(int nums : num){
            if(even(nums)){
                count++;
            }
        }
        System.out.print("Total count of even digits numbers present in the array: ");
        return count;
    }*/

    //Q.5: Find the maximum wealth among given 2D array

    static int maximumWealth(int[][] accounts){
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        System.out.print("Max wealth among given accounts : ");
        return ans;
    }
}

