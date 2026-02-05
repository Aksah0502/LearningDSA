package Recursion;

public class RecursionString {
    public static void main(String[] args) {

       // Q.1:  skipChar("", "abbaccd");

        // Q.2: System.out.println(skipStr("fghapplejkl"));

        // Q.3: System.out.println(skipAppnotApple("asdappdfg"));


    }

    /* Q.1 : Skip a character.
    static void skipChar(String p, String st){

        if(st.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch= st.charAt(0);

        if(ch == 'a'){
            skipChar(p, st.substring(1));
        } else{
            skipChar(p + ch, st.substring(1));
        }

    }*/
/// /////////////////////////////////////////////////////////////////////////////////////////////

    /* Q.2: Skip a String

    static String skipStr(String st){

        if(st.isEmpty()){
            System.out.println("String is Empty");
            return "";
        }

        if(st.startsWith("apple")){
            return st.substring(5);
        } else{
            return st.charAt(0) + skipStr(st.substring(1));
        }
    }*/
/// ////////////////////////////////////////////////////////////////////////////////////////////

     /*Q.3: Skip the required string not if it is present in another string
     Eg: skip app not apple, so only if a string contains app then skip.
            dfgappjkl -> skip, result = dfgjkl
            dfgapplejkl -> no skip, result = dgfapplejkl

    static String skipAppnotApple(String st){

            if(st.isEmpty()){
                System.out.println("String is Empty");
                return "";
            }

            if(st.startsWith("app") && !st.startsWith("apple")){
                return st.substring(3);
            } else{
                return st.charAt(0) + skipAppnotApple(st.substring(1));
            }

    }*/
/// ////////////////////////////////////////////////////////////////////////////////////////

    // Q.4: SubSequence problem

    // return all the subsequence of a string.
    // Eg: Str = "abc"
    // subset = {a}, {b}, {c}, {ab},{bc}, {ac}, {abc}, order matters, so ab != ba.

    //[NOTE: When to use?????
    //     the pattern of taking some element and removing some elements, is known as subset
    //         common difference between sunset and subsequence is the order, in subset, order doesn't matter and vis-versa in subsequence.]

    static void subset(String p , String str){

      if(str.isEmpty()){
          System.out.println(p);
          return;
      }

      char ch = str.charAt(0);

      subset(p+ch, str.substring(1));
      subset(p, str.substring(1));
    }



}
