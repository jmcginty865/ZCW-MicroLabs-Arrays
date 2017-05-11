package io.zipcoder.microlabs.arrays;


import java.lang.reflect.Array;

public class ArrayParty {


    public String printArray(String[] inputArray){
        String arrayIndexValue = "";

        for(int i = 0; i < inputArray.length; i++ ){
            if(i > inputArray.length -1) {
                arrayIndexValue += inputArray[i];
            }
            else if(i != inputArray.length){
                arrayIndexValue += inputArray[i] + "\n";
            }
         }


       // System.out.print(arrayIndexValue);
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

    //TODO Define the method isPalindrome

    //TODO Define the method compress

    //TODO Define the method pack



}
