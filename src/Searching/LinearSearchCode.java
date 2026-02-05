package Searching;

class LinearSearchCode {

    static int linearSearch( int[] arr, int target){
        // checking if the array is empty or not
        if( arr.length == 0){
            return -1;
        }
        // searching for the target

//        for( int i = 0; i<arr.length;i++){
//            int element = arr[i];
//            if(element == target){
//                System.out.print("Index of target element is :  ");
//                return i;
          for(int element : arr){
              if(element==target){
                  return element;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1,5,7,-5,45,74,88,-6,-7,-11,34,23};
        int target = 16;
        int a = linearSearch(numbers, target);
        System.out.println(a);
    }
}