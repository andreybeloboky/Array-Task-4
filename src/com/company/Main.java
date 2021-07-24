package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array");
        int size = scanner.nextInt();
        if (size > 0) {
            int[] array = ArrayGenerator.createArray(size);
            int[] resultFilterArray = ArrayFilter.orderTheArray(array);
            for (int i = 0; i < resultFilterArray.length; i++) {
                System.out.println(resultFilterArray[i]);
            }
        } else {
            System.out.println("Array size must be greater than 0 ");
        }
    }
}
