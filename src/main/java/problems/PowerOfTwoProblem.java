package problems;

public class PowerOfTwoProblem {

    public static void main(String[] args){

        int n = 5;

        System.out.println(findPowerOfTwo(n));

    }

    public static boolean findPowerOfTwo(int n){
        if (n <= 0){
            return false;
        }
        return (n & (n-1)) == 0;
    }
}
