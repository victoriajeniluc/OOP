package com.vikky.lecture30.test;
/**
 * Test class to sort an int array by either using BubbleSort or NewIntSort.
 *
 * @author Udayan Khattry
 */


import com.vikky.lecture30.BubbleSort;
import com.vikky.lecture30.NewIntSort;
import com.vikky.lecture30.SortingUtil;

public class TestSorting {
    public static void main(String[] args) {
        int [] arr1 = {200, 10, 0 , -76};
        //SortingUtil.sortIntArray(arr1, new BubbleSort()); //Use sort(int []) method of BubbleSort to sort the array
        SortingUtil.sortIntArray(arr1, new NewIntSort()); //Use sort(int []) method of NewIntSort to sort the array
        printIntArray(arr1);
    }

    /**
     * This method prints all the elements in an int array.
     *
     * @param arr int [] object to print
     */
    private static void printIntArray(int [] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
