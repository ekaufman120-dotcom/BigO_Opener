
/**
 * BigO.java 
 *
 * I have an array of the numbers 1 to 10 in random order. 
 * One of the numbers is missing (value changed to zero). Write an algorithm to 
 * figure out what the number is (and what position is missing). 
 */

public class BigO{
    public static void main(String[] args){
        findTheBlank(new int[]{0});
    }

    public static void findTheBlank(int[] theNumbers) {
        int missingNumber = -1;
        int blankSpace = -1;
        
        System.out.println("Missing number = " + missingNumber + 
            " at location " + blankSpace +" of the array");
    }
}