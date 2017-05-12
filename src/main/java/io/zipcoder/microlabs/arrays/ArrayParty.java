package io.zipcoder.microlabs.arrays;


import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayParty {


    public String printArray(String[] inputArray){
        String arrayIndexValue = "";

        for(int i = 0; i < inputArray.length; i++ ){
            if(i != inputArray.length){
                arrayIndexValue += inputArray[i] + "\n";
            }
         }
        return "*** Output ***\n" + arrayIndexValue.trim();
    }


    public String lastElement(String[] inputArray){
        String lastElement = "";

        lastElement = inputArray[inputArray.length-1];

        return "*** Output ***" + "\n" + lastElement;
    }


    public String lastButOne(String[] inputArray){
        String secondToLastElement = "";

        secondToLastElement = inputArray[inputArray.length-2];

        return "*** Output ***" + "\n" + secondToLastElement;
    }

    //TODO Define the method reverse
    public String [] reverse(String [] inputArray){
       String reverseArray= "";
        String [] secondArray = new String [inputArray.length + 1];

        secondArray[0] = "*** Output ***";

        for(int i = inputArray.length -1, j = 1; i >= 0; i--, j++) {
            secondArray[j] =  inputArray[i];
        }


        return secondArray;
    }


    public boolean isPalindrome(String [] inputArray){

        for(int i = inputArray.length - 1, j = 0; i>= inputArray.length/2 ; i --, j++ ){
            if(inputArray[i] != inputArray[j]){

                return false;
            }
        }
        return true;
    }



    //TODO Define the method compress
//    public String compress(int [] inputArray) {
//        String compressedNumbers = "";
//        int compareArray = 0;
//
//
//        for(int i = 0 , j = 0; i < inputArray.length; i++, j++){
//            if(inputArray[j] != inputArray[i]){
//                compareArray += inputArray[i];
//            }
//        }
//        return "*** OutPut ***\n" + ":" + compressedNumbers.trim();
//    }


    //TODO Define the method pack



}
