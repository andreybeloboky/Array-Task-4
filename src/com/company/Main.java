package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size array");
        int size = scanner.nextInt();
        if (size > 0) {
            int[] array = ArrayGenerator.create(size);
            int[] resultFilterArray = ArraySorter.selectionSort(array);
            ArrayOutput.consoleOutput(resultFilterArray);
        } else {
            System.out.println("Array size must be greater than 0 ");
        }
    }
}
