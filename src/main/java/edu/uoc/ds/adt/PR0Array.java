package edu.uoc.ds.adt;

public class PR0Array {
    private final int POSITIONS = 50;

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

    public int getIndexOf(int number) {
        boolean found;
        int index;

        index = 0;
        found = false;
        while (!found && index < this.array.length) {
            if (number == this.array[index])
                found = true;
            index++;
        }
        if (found)
            return (index - 1);
        else
            return (-1);
    }

    public int binarySearch(int number) {
        return (getIndexOf(number));
    }
}