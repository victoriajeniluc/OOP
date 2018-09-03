package com.vikky.lecture30;

/**
 * NewIntSort implements ISort and overrides sort(int []) method.
 * The sort(int []) method uses sort(int []) method of Arrays class to sort the array.
 *
 * @author Udayan Khattry
 */

import java.util.Arrays;

public class NewIntSort implements ISort {
    @Override
    public void sort(int[] arr) {
        Arrays.sort(arr);
    }
}
