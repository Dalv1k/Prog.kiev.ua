package net.ukr.p454;

import java.util.Random;

/**
 * Created by vkekukh on 05.09.2016.
 */
public class ArrayIntNumber implements Runnable{
    private int sum;
    private int startPosition;
    private int finishPosition;
    private int[] array;

    public ArrayIntNumber(int startPosition, int finishPosition, int[] array) {
        this.startPosition = startPosition;
        this.finishPosition = finishPosition;
        this.array = array;
    }

    public ArrayIntNumber(int[] array) {
        this.array = array;
    }

    public ArrayIntNumber() {
    }

    public int getStartPosition() {
        return startPosition;
    }

    public void setStartPosition(int startPosition) {
        this.startPosition = startPosition;
    }

    public int getFinishPosition() {
        return finishPosition;
    }

    public void setFinishPosition(int finishPosition) {
        this.finishPosition = finishPosition;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    //calculate from first element to last element
    public void calculateArray() {

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
    }

    public void calculateArray(int from, int to) {

        if (to == 0) {
            calculateArray();
            return;
        }

        for (int i = from; i < to; i++) {
            sum += array[i];
        }
    }

    @Override
    public void run() {
        calculateArray(this.startPosition, this.finishPosition);
    }

    public static int[] fillArray(int length){
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }
}
