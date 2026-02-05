package Recursion;

import java.util.ArrayList;

public class RecursionArray {
    public static void main(String[] args) {
        /*Q.1
        int[] arr = {3,5,7,9};
        System.out.println(sort(arr,0));*/

        /*  Q.2
        int[] arr = {1,77,44,33,22,55,66,23,32,67,41,53};
        System.out.println(linearSearch(arr,0,21));//using boolean return type
        System.out.println(findIndex(arr,0,23));*/

        /* Q.3
        int[] arr = {1,77,44,33,22,55,66,23,32,67,41,53,44};
        findIndex(arr,0,44);
        System.out.println(list);*/

        /* Q.4
        int[] arr = {1,77,44,33,22,55,66,23,32,67,41,53,44};
        System.out.println(findIndexes(arr,0,44,new ArrayList<>()));*/

    }

    /* Q.1 Check if an Array is sorted or not

    static boolean sort(int[] arr,int i){
        if( i == arr.length - 1 ){
            return true;
        }

        return arr[i] < arr[i+1] && sort(arr,i+1);
    }*/

    /// //////////////////////////////////////////////////////

    /*Q.2: Linear Search

    static boolean linearSearch(int[] arr, int index, int target){

        if(index == arr.length ){
            return false;
        }
        return arr[index]==target || linearSearch(arr, index+1, target);
    }

    static int findIndex(int[] arr, int index, int target){

        if(index == arr.length ){
            return -1;
        }

        if( arr[index]==target){
            return index;
        }
         else{
             return findIndex(arr, index+1, target);}
    }*/

/// /////////////////////////////////////////////////////////

    /*Q.3: Linear Search With Multiple Occurrences

    static ArrayList<Integer> list = new ArrayList<>();
    static void findIndex(int[] arr, int index, int target){

      if(index == arr.length ){
        return ;
      }

      if( arr[index]==target){
        list.add(index);
      }

      findIndex(arr, index+1, target);}*/

    /// /////////////////////////////////////////////

    /*Q.4 : Return occurrences in the form of ArrayList

    static ArrayList<Integer> findIndexes(int[] arr, int i, int target, ArrayList<Integer> list){

        if(i == arr.length ){
            return list ;
        }

        if( arr[i]==target){
            list.add(i);
        }

        return findIndexes(arr, i+1, target,list);
    }*/

    //Try rotated Binary Search Question
}
