package io.zipcoder.microlabs.arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayParty {


    public String printArray(String[] inputArray) {
        String arrayIndexValue = "";

        for (int i = 0; i < inputArray.length; i++) {
            if (i != inputArray.length) {
                arrayIndexValue += inputArray[i] + "\n";
            }
        }
        return "*** Output ***\n" + arrayIndexValue.trim();
    }


    public String lastElement(String[] inputArray) {
        String lastElement = "";

        lastElement = inputArray[inputArray.length - 1];

        return "*** Output ***" + "\n" + lastElement;
    }


    public String lastButOne(String[] inputArray) {
        String secondToLastElement = "";

        secondToLastElement = inputArray[inputArray.length - 2];

        return "*** Output ***" + "\n" + secondToLastElement;
    }



    public String reverse(String[] inputArray) {
        String output =  "*** Output ***";
        //String[] reversedString = new String[inputArray.length - 1];

            for (int j = inputArray.length - 1; j >= 0 ; j--) {
                output +=   " " + inputArray[j];
            }

            return output;
    }


    public boolean isPalindrome(String[] inputArray) {
        String [] reversedArray = new String[inputArray.length];


          for(int i = 0, j = inputArray.length - 1; i <= inputArray.length -1; i++, j--) {
              reversedArray[i] = inputArray[j];
          }


        if(Arrays.equals(reversedArray,inputArray)){
              return true;
        }
        else{
            return false;
        }

    }

    public String compress(int[] inputArray){
        String output = "*** Output ***";

        for(int i = 0; i <= inputArray.length - 1 ; i++) {
            if(i == inputArray.length - 1 && inputArray[i] == inputArray[i]){
                output += "\n:" + inputArray[i];
            }

            if( i != inputArray.length - 1 && inputArray[i] != inputArray[i + 1]){
                output += "\n:" + inputArray[i];
            }
        }
        return output;
    }




    public String pack(char [] inputArray){
        String output = "*** Output *** \n";
        ArrayList<String> subStrings = new ArrayList<String>();

        for(int i = 0; i <= inputArray.length - 1; i++){
            if(i != inputArray.length -1 && inputArray[i] == inputArray[i + 1]){
                subStrings.add(String.valueOf(inputArray[i]));
            }
        }
        System.out.println(subStrings);
        return String.valueOf(subStrings);
    }
}



