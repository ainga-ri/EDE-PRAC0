package edu.uoc.ds.adt;

public class PR0Array {
    private final int POSITIONS = 50;
    private int steps = 0;
    private int[] array;

    public PR0Array() {
        this.array = new int[POSITIONS];
        this.array[0] = 0;
        for (int i = 1; i < POSITIONS; i++) {
            this.array[i] = this.array[i - 1] + 2;
        }
    }

    public int[] getArray() {
        return (this.array);
    }

    public int getSteps() {
        return (steps);
    }

    public int getIndexOf(int number) {
        boolean found;
        int index;

        index = 0;
        found = false;
        while (!found && index < getArray().length) {
            if (number == getArray()[index])
                found = true;
            index++;
        }
        if (found)
            return (index - 1);
        else
            return (-1);
    }

    private int recursiveBinarySearch(int[] array, int number, int low, int high) {
        if (low > high)
            return (-1);
        else {
            steps++;
            int mid = (low + high) / 2;
            if (number == array[mid])
                return (mid);
            else if (number > array[mid])
                return (recursiveBinarySearch(array, number, mid + 1, high));
            else
                return (recursiveBinarySearch(array, number, low, mid - 1));
        }
    }

    public int binarySearch(int number) {
        int low = 0;
        int high = getArray().length - 1;
        return (recursiveBinarySearch(getArray(), number, low, high));
    }
}