package edu.uoc.ds.adt;

public class Main {
    public static void main(String[] args) {
        PR0Array array1 = new PR0Array();
        PR0Array array2 = new PR0Array();
        int number = 24;

        int steps1SS = array1.getIndexOf(number);
        array1.binarySearch(number);
        int steps1BS = array1.getSteps();
        System.out.printf("To search the number %d it took for the Sequential Search " +
                "%d and for Binary Search %d\n", number, steps1SS, steps1BS);

        number = 4;
        int steps2SS = array2.getIndexOf(number);
        array2.binarySearch(number);
        int steps2BS = array2.getSteps();
        System.out.printf("To search the number %d it took for the Sequential Search" +
                " %d and for Binary Search %d\n", number, steps2SS, steps2BS);
    }
}
