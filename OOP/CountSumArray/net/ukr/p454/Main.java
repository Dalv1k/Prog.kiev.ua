package net.ukr.p454;


import java.util.Arrays;

/**
 * Created by vkekukh on 05.09.2016.
 */
public class Main {

    public static void main(String[] args) {

        int lengthArray = 1_000_000;
        int [] array = ArrayIntNumber.fillArray(lengthArray);
        ArrayIntNumber oneThread = new ArrayIntNumber(array);

        long startTime = System.currentTimeMillis();
        oneThread.calculateArray();
        long finishTime = System.currentTimeMillis();
        System.out.println(oneThread.getSum() + " Counted for " + (finishTime - startTime) + "ms");


        int countThreads = Runtime.getRuntime().availableProcessors() * 2;
        Thread[] threads = new Thread[countThreads];
        ArrayIntNumber[] arrayIntNumbers = new ArrayIntNumber[lengthArray];

        // If array of length isn't divided into the number of threads than remaining elements are uniformly distributed over the threads
        // For this we use variable shift

        int step = lengthArray / countThreads;
        int remainder = lengthArray % countThreads;
        int shift = 0;
        int sumArray = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < countThreads; i++) {
            int startPosition;
            int finishPosition;


            if (remainder > i) {

                startPosition = (i * step) + shift;
                finishPosition = ((i + 1) * step) + (++shift);
                arrayIntNumbers[i] = new ArrayIntNumber(startPosition,finishPosition, array);
                threads[i] = new Thread(arrayIntNumbers[i], "Thread " + i);
                threads[i].start();
            } else {
                startPosition = (i * step) + shift;
                finishPosition = ((i + 1) * step) + shift;

                arrayIntNumbers[i] = new ArrayIntNumber(startPosition,finishPosition, array);
                threads[i] = new Thread(arrayIntNumbers[i], "Thread " + i);
                threads[i].start();
            }

        }

        for (int i = 0; i < countThreads; i++) {
            try{
                threads[i].join();
                sumArray += arrayIntNumbers[i].getSum();
            }catch (InterruptedException e ){
               System.err.println(e);
            }
        }
        finishTime = System.currentTimeMillis();
        System.out.println("Threads:" + sumArray +  " Counted for " + (finishTime - startTime) + "ms");
    }

}
