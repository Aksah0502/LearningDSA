package Recursion;

public class Level_1_Questions {

    public static void main(String[] args) {
       //Q.1 func(5);
        // Q.2 funcRev(5);
        //Q.3 func2(5);
        /* Q.4 int ans =  fact(6);
        System.out.println(ans);*/

       /* Q.5 int ans =  sumOfDigit(1567);
       System.out.println(ans);*/

       /* Q.6  int ans = digitsProduct(4321);
        System.out.println(ans);*/


    }

    /*Q.1:   Take a number 'n', then print n to 1.
    static void func(int n){

        //Base Condition
        if(n==0){
            return;
        }

        System.out.print(n);
        System.out.print(" ");
        func(n-1);// Recursive Case. OR func(--n); not func(n--)-> this cause stack overflow

    }*/

    /// /////////////////////////////////////////////////////////
    /*Q.2: Now print 1 to n.

    static void funcRev(int n){

        //Base Condition
        if(n==0){
            return;
        }

        funcRev(n-1);// Recursive Case.
        System.out.print(n);
        System.out.print(" ");

    }*/
    /// ////////////////////////////////////////////////////////

    /*Q.3 : Now print n to1 then 1 to n

    static void func2(int n){

        if(n==0){
            return;
        }

        System.out.println(n);
        func2(n-1);
        System.out.println(n);
    }*/

    /// ///////////////////////////////////////////////////////////////
    /* Q.4 : Factorial of a number. Eg: 5! = 5*4*3*2*1 = 120.

    static int fact(int n){

        if(n==0 || n==1){ // assuming no negative number should be given as input
            return 1;
        }

        else{
            return n * fact(n-1);
        }

    }*/

    /// /////////////////////////////////////////////////////////////////////
    /* Q.5 : Find the sum of digits of a given number. Eg: 1234 : 1+2+3+4 = 10.

    static int sumOfDigit(int n){


        if(n == 0){
            return 0;
        }

        return (n % 10) + sumOfDigit(n/10);

    }*/

    /// ////////////////////////////////////////////////////////////////////
    /*Q.6 : Product of digits

    static int digitsProduct(int n){

        if(n%10 == n){
            return n;
        }

        return (n % 10) * digitsProduct(n/10);

    }*/

// Practice more questions like Fibonacci series, palindrome, reverse of a number etc.
}



