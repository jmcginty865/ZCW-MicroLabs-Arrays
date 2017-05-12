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
    public void isPalindromeTrueTest(){
        ArrayParty arrayParty = new ArrayParty();
        String [] palindromic = {"Sausage", "Eggs", "Beans",
                "Beans", "Eggs", "Sausage"};

        boolean expected = true;

        boolean actual = arrayParty.isPalindrome(palindromic);

        Assert.assertEquals("This should return true", expected, actual);
    }

    @Test
    public void isPalindromeFlaseTest(){
        String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};
        ArrayParty arrayParty = new ArrayParty();

        boolean expected = false;

        boolean actual = arrayParty.isPalindrome(breakfast);

        Assert.assertEquals("This should return false", expected,actual);
    }

    //TODO Define the method compressTest
    @Test
    public void compressTest(){
        ArrayParty arrayParty = new ArrayParty();
        int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};

        String expected = "*** Output ***\n:1\n:3\n:2\n:4";
        String actual = arrayParty.compress(nums);

        Assert.assertEquals("This should print out :1:3:2:4", expected, actual);
    }

    //TODO Define the method packTest


}
