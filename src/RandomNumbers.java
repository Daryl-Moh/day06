
import java.security.SecureRandom;
LambaExampleimport java.util.List;
import java.util.Random;

public class RandomNumbers implements Runnable {

    private String name;
    private Integer range;
    private List<Integer> numList;

    public RandomNumbers (String name, Integer range, List<Integer> numList) {
        this.name = name;
        this.range = range;
        this.numList = numList;

    }
    
    @Override
    public void run() {

        Random rand = new SecureRandom();
        for (Integer i=0; i<=10; i++ ) {

            Integer num = rand.nextInt(range);
            numList.add(num);
            //System.out.println(name + "-->" + num);
            System.out.printf("%d [%s] %d\n", i, name, num);

            try{
                
                Thread.sleep(2 * 1000); //Sleep for X sec
    
            } catch (InterruptedException e) {
    
            }
            
        }

    }

}
