
/**
 * BigO.java 
 *
 * I have an array of the numbers 1 to 10 in random order. 
 * One of the numbers is missing (value changed to zero). Write an algorithm to 
 * figure out what the number is (and what position is missing). 
 */

//dearest copilot can you please stop making suggestions ok bye
public class BigO{
    public static void main(String[] args){
        findTheBlank(new int[]{0});
    }

    public static void findTheBlank(int[] theNumbers) {
        int missingNumber = -1;
        int blankSpace = -1;
        
        if(theNumbers.length != 10){
            try{
                throw new IncorrectArrayException("Array must be of length 10.");
            } catch(IncorrectArrayException e){
                e.getMessage();
            }
        }

        for(int i = 0; i < theNumbers.length; i++){
            if(theNumbers[i] == 0){
                blankSpace = i;
            }
        }

        if(blankSpace == -1){
            try{
                throw new IncorrectArrayException("Array must contain a zero to indicate the missing number.");
            } catch(IncorrectArrayException e){
                e.getMessage();
            }
        }

        for(int i = 1; i <=10; i++)
        {
            boolean foundNum = false;
            for(int j = 0; j < theNumbers.length; j++)
            {
                if(theNumbers[j] == i){
                    foundNum = true;
                    break;
                }
            }
            if(!foundNum){
                missingNumber = i;
                break;
            }
        }

        System.out.println("Missing number = " + missingNumber + " at location " + blankSpace +" of the array");
    }
}