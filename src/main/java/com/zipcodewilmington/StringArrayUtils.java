package com.zipcodewilmington;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean result = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                result = true;
            }
        }
        return result;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reversed = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            reversed[array.length - i - 1] = array[i];

        }
        return reversed;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        String[] reversed = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            reversed[array.length - i - 1] = array[i];

        }
        return Arrays.equals(reversed, array);

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String words = Arrays.toString(array).toLowerCase();
        int falsy = 0;
        for (char j = 'a'; j <= 'z'; j++) {
            if (words.indexOf(j) == -1) {
                falsy++;
            }
        }
        return falsy == 0;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int occurrences = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                occurrences++;
            }
        }
        return occurrences;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] solutionArray = new String[array.length - 1];
        ArrayList placeholder = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            placeholder.add(array[i]);
        }
        placeholder.remove(placeholder.indexOf(valueToRemove));
        for (int i = 0; i < placeholder.size(); i++) {
            solutionArray[i] = (String) placeholder.get(i);
        }
        return solutionArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removed but leave the original one of two
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {

        ArrayList converted = new ArrayList();

        ArrayList solutionList = new ArrayList();
        for (int i = 0; i < array.length; i++) {
            converted.add(array[i]);
        }
        for (int i = 0; i < converted.size() - 1; i++) {
            if (converted.get(i) != converted.get(i + 1)) {
                solutionList.add(converted.get(i));
            } else if ((converted.get(i) == converted.get(converted.size() - 1))) {
                solutionList.add(converted.get(i));
            }
        }
        if (converted.get(converted.size() - 1) != converted.get(converted.size() - 2)) {
            solutionList.add(converted.get(converted.size() - 1));
        }


        String[] solutionArray = new String[solutionList.size()];
        for (int i = 0; i < solutionArray.length; i++) {
            solutionArray[i] = (String) solutionList.get(i);
        }
        System.out.println(array + "\n" + converted + "\n" + solutionList + "\n" + solutionArray + "\n");
        return solutionArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        int counter = 0;
        int arrayLength = array.length;
        int iterator = 0;
        for (int i = array.length - 1; i > 0; i--) {
            if (array[i] != null && array[i].charAt(0) == array[i - 1].charAt(0)) {
                array[i - 1] += array[i];
                array[i] = null;
                counter++;
            }
        }
        String[] packConsecutive = new String[arrayLength - counter];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                packConsecutive[iterator] = array[i];
                iterator++;
            }
        }
        return packConsecutive;

        /* String[] placeHolder = new String[array.length];


        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i+1]){
                placeHolder[i] = array[i]+ array[i+1];
                i++;

            }
            if ((array[i] != array[i-1])){
                placeHolder[i] = array[i];
            }

            }
        System.out.println(Arrays.toString(placeHolder));
        return placeHolder;
            }
   */
    }
}



