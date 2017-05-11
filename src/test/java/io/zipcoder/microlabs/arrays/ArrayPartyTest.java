package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest(){
        //: Given
        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        //: When
        String actual = arrayParty.printArray(breakfast);

        //: Then
        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        //: Given

            String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
            ArrayParty arrayParty =  new ArrayParty();
            String expected = "*** Output ***\nMushrooms";

        //: When

        String actual = arrayParty.lastElement((breakfast));

        //: Then

        Assert.assertEquals("This should return the last element of the the array Mushrooms", expected, actual);
    }


    @ Test
    public void lastButOneTest(){
        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String expected = "*** Output ***\nTomatoes";

        String actual = arrayParty.lastButOne(breakfast);

        Assert.assertEquals("This should return the second to last element Tomatoes", expected ,actual);
    }

    @Test
    public void reverseTest(){
        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();
        String [] expected = {"*** Output ***","Mushrooms","Tomatoes","Bacon","Beans","Eggs","Sausage"};

        String[] actual = arrayParty.reverse(breakfast);

        Assert.assertArrayEquals("This should return the reverse of the Array", expected, actual);
    }

    //TODO Define the method isPalindromeTest
    @Test
    public void isPalindromeTest(){
        
    }

    //TODO Define the method compressTest

    //TODO Define the method packTest


}
