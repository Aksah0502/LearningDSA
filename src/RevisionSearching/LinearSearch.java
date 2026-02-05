package RevisionSearching;

//import java.util.Scanner;
public class LinearSearch {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter the target element : ");
//        int target = sc.nextInt();

        int[] arr = {10, 15, 17, 33, 37, 83, 27, 93};

        int target = 15;

        int ans = linearSearch(arr, target);

        System.out.print(ans);

    }

    static int linearSearch(int[] arr, int target){

        if(arr.length == 0){
            System.out.println("Invalid Input!! Array is Empty");
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {

            int element  = arr[index];

            if(element == target){
                System.out.print("Element found at index : ");
                return index;
            }
        }

        return -1;
    }
}
