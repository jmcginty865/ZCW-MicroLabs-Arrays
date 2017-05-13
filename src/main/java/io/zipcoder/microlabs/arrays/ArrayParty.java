package io.zipcoder.microlabs.arrays;


import com.sun.deploy.util.StringUtils;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.lang.reflect.Array;
import java.util.*;

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


    public String[] reverse(String[] inputArray) {
        String reverseArray = "";
        String[] secondArray = new String[inputArray.length + 1];

        secondArray[0] = "*** Output ***";

        for (int i = inputArray.length - 1, j = 1; i >= 0; i--, j++) {
            secondArray[j] = inputArray[i];
        }


        return secondArray;
    }


    public boolean isPalindrome(String[] inputArray) {

        for (int i = inputArray.length - 1, j = 0; i >= inputArray.length / 2; i--, j++) {
            if (inputArray[i] != inputArray[j]) {

                return false;
            }
        }
        return true;
    }

    public String compress(int[] inputArray){
        String output = "*** Output ***";
        for(int i = 0; i < inputArray.length - 1; i++){
            if(i == inputArray.length -2  && inputArray[i] == inputArray[i - 1]){
                output += "\n" + ":" + inputArray[i];
            }
            if(inputArray[i] != inputArray[i + 1]){
                output += "\n" + ":" + inputArray[i];

            }

        }

        return output ;
    }
}



    //TODO Define the method pack



