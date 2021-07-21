package com.company;

/*
 * @param array - the array to be sorted;
 * @return - filter array ;
 */
public class ArrayFilter {
    public static int[] orderTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int savingTheNumberForExchange = array[i];
                    array[i] = array[j];
                    array[j] = savingTheNumberForExchange;
                }
            }
        }
        return array;
    }
}
