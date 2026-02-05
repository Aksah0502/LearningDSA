package Hashing;

import java.util.*;

public class HashingPractice {

   /*  Q:1 Find the all elements whose frequency is greater than n%3;
     Eg: [1,2,5,3,2,1,3,5,1]
    Output: 1(Freq. = 4) since frequency: n%3=9%3=3

    public static void majorityElement(int nums[]){

        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){ //true
                map.put(nums[i],map.get(nums[i])+1);
            } else{ //false
                map.put(nums[i], 1);
            }
        }
        for(int key : map.keySet()){
            if(map.get(key) >n/3){
                System.out.println(key);
            }
        }
    }*/

  /*  Q.2: Union of two Arrays(We will use HashSet for storing values from each array as the Set only stores unique elements.)
    By the help of HashSet the time complexity will be reduced to 0(n) from 0(n^2) of Nested For Loops
    public static void union(int arr1[], int arr2[]){
        HashSet<Integer> Set = new HashSet<>();
        for(int i= 0;i<arr1.length;i++){
            Set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            Set.add(arr2[j]);
        }

        System.out.println("The Union : " + Set.size());
    }*/

    /*Q.3: Intersection of 2 Arrays

    public static int intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> Set = new HashSet<>();

        int count = 0;

        for (int i = 0;i<arr1.length;i++) {
            Set.add(arr1[i]);
        }

        for (int j = 0;j<arr2.length;j++) {
            if (Set.contains(arr2[j])) {
                count++;
                Set.remove(arr2[j]);
            }
        }
        return count;
    }*/

    /*Q.4: Find Itinerary from Tickets

    public static String getStart(HashMap<String,String> tick){
        HashMap<String,String> revMap = new HashMap<>();

        for(String key : tick.keySet()){
            revMap.put(tick.get(key),key);
        }

        for(String key:tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }*/




    public static void main(String[] args){
     /*  Q.1
        int nums[] = {1,3,4,2,1,4,5,1,3,2,1};
        majorityElement(nums);*/

      /*  Q.2:
        int[] arr1 = {7,4,3};
        int[] arr2= {1,2,4,6,3,7};
        union(arr1,arr2);*/

      /*Q.3:
        int[] arr1 = {7,4,3};
        int[] arr2 = {1,2,4,6,3,7};
        System.out.println(intersection(arr1,arr2));*/

        /*Q.4

        HashMap<String,String> tick = new HashMap<>();

        tick.put("Chennai","Bengaluru");
        tick.put("Mumbai","Delhi");
        tick.put("Goa","Chennai");
        tick.put("Delhi","Goa");

        String start = getStart(tick);

        while(tick.containsKey(start)){
            System.out.print(start + " -> ");
            start = tick.get(start);
        }

        System.out.println(start);  */


    }
}
