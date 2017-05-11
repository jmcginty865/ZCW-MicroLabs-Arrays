package io.zipcoder.microlabs.arrays;


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

    //TODO Define the method lastButOne

    //TODO Define the method reverse

    //TODO Define the method isPalindrome

    //TODO Define the method compress

    //TODO Define the method pack



}
