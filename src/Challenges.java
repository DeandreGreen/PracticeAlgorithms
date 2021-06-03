import java.util.ArrayList;
import java.util.Arrays;

public class Challenges {
    /** Create a function which returns the number of true values there are in an array.*/

    //working
    public static int countTrueFalse(boolean[] arr) {
      /*set up a statement that counts the amount of times that
       true appears in the arraylist.
       I could use a for loop that is set up to use an int++ for everytime that "True" is present*/
        int count = 0;
        for( boolean each:arr ){
            if(each) count++;
        }
        return count;
    }

    /** Create a function that takes an array and returns the absolute difference between the biggest and smallest numbers.*/

    //working
    public static int differenceMinMax(int[] nums){
        /*write a function that takes the biggest and smallest numbers in an arraylist and find the absolute value
        between the two of them*/
            Arrays.sort(nums);
            return Math.abs(nums[0]-nums[nums.length-1]);

    }

    /**
     * Stutter
     * Write a function that stutters a word as if someone is struggling to read it.
     * The first two letters are repeated twice with an ellipsis ... and space after each,
     * and then the word is pronounced with a question mark ?
     */

    //working
    public static String stutter(String str){
        String ellipsis = "... ";
        String result = "" + str.charAt(0) + str.charAt(1) + ellipsis;
        result = result + result;

        return result + str + "?";
    }

    /** Write a function that takes an array of numbers and returns the second largest number.*/

    //working
    public static int secondLargestNumber(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length-2];

    }

    /**
     FizzBuzz
     Create a function that takes a number as an argument and returns "Fizz", "Buzz" or "FizzBuzz".
     If the number is a multiple of 3 the output should be "Fizz".
     If the number given is a multiple of 5, the output should be "Buzz".
     If the number given is a multiple of both 3 and 5, the output should be "FizzBuzz".
     If the number is not a multiple of either 3 or 5, the number should be output on its own as shown in the examples below.
     The output should always be a string even if it is not a multiple of 3 or 5.
     **/

    //working
    public static String fizzBuzz(int num){
        String output = Integer.toString(num);
        if ((num % 3 ==0) && (num % 5==0)){
            output = "FizzBuzz";
            System.out.println("FizzBuzz");
        }
        else if (num % 3 == 0){
           output = "Fizz";
                   System.out.println("Fizz");
        }
        else if (num % 5 == 0){
            output = "Buzz";
            System.out.println("Buzz");
        }
        return output;
    }

    /**
     * Skip Counting
     * Write a program that gets three integers from the user.
     * Count from the first number to the second number in increments of the third number.
     */

    //working
    public static String skipCount(int countFrom, int countTo, int countBy){
        // Validate
        if(countTo < countFrom){
            return "Try again with better numbers!";
        }
        // hold the pattern temporarily
        StringBuilder answer= new StringBuilder();
        // create Pattern based on user input, using a for loop to create the pattern
        for (int currentInt=countFrom; currentInt<=countTo; currentInt += countBy){
            answer.append(currentInt).append(".. ");
        }
        // remove the last three characters because they are extras
        answer.setLength(answer.length()-3);
        //return our answer
        return answer.toString();
    }

    /** The "Reverser"
     * takes a string as input and returns that string in reverse order, with the opposite case.*/

    //working
    public static String reverser(String reverseMe){
        String result = "";
        for(char c: reverseMe.toCharArray()){
            if (Character.isUpperCase(c)){
                c = Character.toLowerCase(c);
            } else {
                c = Character.toUpperCase(c);
            }
            result = c + result;
        }

        // you will need to change the return statement
        return result;
    }

    /**
     * Reverse An Array
     * Write a function that reverses the order of an array
     */

    //working
    public static int[] reverseArray(int[] arr){
        int arrlength = arr.length;
        int[] newarr = new int[arr.length];
        for(int x=0; x< arrlength; x++){
            int pos = arrlength-x-1;
            //System.out.println(x+"      "+pos);
            //System.out.println(arr[x]+"      "+arr[pos]);
            newarr[x] = arr[pos];
            //System.out.println(newarr[x]+"      "+newarr[pos]);
        }
        // you will need to change the return statement
        return newarr;
    }

    /**
     * Write a function that finds the word "bomb" in the given string (not case sensitive).
     * Return "DUCK!" if found, otherwise,"Relax, there's no bomb.".
     */

    //working
    public static String duckTheBomb(String checkMe){
        //Search string for "bomb"
        //if bomb is found return "DUCK!"
        checkMe = checkMe.toLowerCase();
        if (checkMe.contains("bomb")){
            return ("DUCK!");
        }
        //if bomb is not found return "Relax, there's no bomb.".
        return "Relax, there's no bomb.";
    }

    /** Sort in Ascending Order
     * Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).
     * If the function's argument is null, an empty array or undefined, return an empty array
     */

    //working
    public static int[] sortNumsAscending(int[] nums){
        Arrays.sort(nums);
        return nums;
    }

    /**
     * Remove Duplicates
     * Create a method that takes an array of strings,removes all duplicate items
     * and returns a new array in the same sequential order as the old array (minus duplicates).
     */

    //working
    public static String[] removeDups(String[] str){
        ArrayList<String> cleanList = new ArrayList<>();
        for(String each : str){
            if(!cleanList.contains(each)){
                cleanList.add(each);
            }
        }
        return cleanList.toArray(new String[0]);
    }
}