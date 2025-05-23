package week3.stopWatch;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100000];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100000);
        }
        StopWatch sw = new StopWatch();
        sw.Start();
        for (int i = 0; i < array.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    sw.Stop();
        System.out.println("Elapsed time for Selection Sort: " + sw.getElapsedTime() + " milliseconds");
    }
}
