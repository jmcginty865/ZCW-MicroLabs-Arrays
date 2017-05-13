package io.zipcoder.microlabs.arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayPartyTest {

    @Test
    public void printArrayTest(){
        ArrayParty arrayParty = new ArrayParty();

        String[] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\n" +
                "Sausage\n" +
                "Eggs\n" +
                "Beans\n" +
                "Bacon\n" +
                "Tomatoes\n" +
                "Mushrooms";

        String actual = arrayParty.printArray(breakfast);

        Assert.assertEquals("The two string outputs are equal", expected, actual);
    }

    @Test
    public void lastElementTest(){
        ArrayParty arrayParty = new ArrayParty();

        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\nMushrooms";

        String actual = arrayParty.lastElement((breakfast));

        Assert.assertEquals("This should return the last element of the the array Mushrooms", expected, actual);
    }


    @ Test
    public void lastButOneTest(){
        ArrayParty arrayParty = new ArrayParty();
        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        String expected = "*** Output ***\nTomatoes";

        String actual = arrayParty.lastButOne(breakfast);

        Assert.assertEquals("This should return the second to last element Tomatoes", expected ,actual);
    }

    @Test
    public void reverseTest(){
        ArrayParty arrayParty = new ArrayParty();
        String [] breakfast = {"Sausage", "Eggs", "Beans", "Bacon", "Tomatoes", "Mushrooms"};
        String [] expected = {"*** Output ***","Mushrooms","Tomatoes","Bacon","Beans","Eggs","Sausage"};

        String[] actual = arrayParty.reverse(breakfast);

        Assert.assertArrayEquals("This should return the reverse of the Array", expected, actual);
    }


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
        ArrayParty arrayParty = new ArrayParty();

        String [] breakfast = {"Sausage", "Eggs", "Beans",
                "Bacon", "Tomatoes", "Mushrooms"};


        boolean expected = false;

        boolean actual = arrayParty.isPalindrome(breakfast);

        Assert.assertEquals("This should return false", expected,actual);
    }


    @Test
    public void compressTest(){
        ArrayParty arrayParty = new ArrayParty();

        int [] nums = {1,1,3,3,3,2,2,2,1,1,1,1,4,4,4,4};

        String expected = "*** Output ***\n:1\n:3\n:2\n:1\n:4";
        String actual = arrayParty.compress(nums);

        Assert.assertEquals("This should print out :1:3:2:1:4", expected, actual);
    }


    @Test
    public void packTest(){
        ArrayParty arrayParty = new ArrayParty();
        
        char [] letters = {'a','a','a','a','b','c','c','a','a','d','e','e','e','e'};

        String expected = "*** Output ***\naaaa,b,cc,aa,d,eeee";
        String actual = arrayParty.pack(letters);

        Assert.assertEquals("This should return *** Output *** \n aaaa, b, cc, aa, d, eeee", expected, actual);
    }


}
