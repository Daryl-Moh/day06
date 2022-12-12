

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Day06Thread {

    public static void main(String[] args) {

        List<Integer> numList = new LinkedList<>();
        ExecutorService threadPool = Executors.newFixedThreadPool(2); //1 means only when the 1st thread finishes the 2nd can start

        for (Integer i=0; i<3; i++) {

            // Create a thread
            RandomNumbers thr = new RandomNumbers("thr-%d".formatted(i),100, numList);
            // Schedule a thread to the Runnable
            threadPool.submit(thr);
        }


        System.out.println("All done!");

        while(true) {

            System.out.println("\n>>>>> numList:" + numList + ", size: " + numList.size());

            // try{

            //     Thread.sleep(2 * 1000); //Sleep for X sec

            // } catch (InterruptedException e) {

            // }

        }

    }
}
