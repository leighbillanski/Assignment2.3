package za.ac.cput;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    String seed;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {


        Fish fish = new Fish();
        fish.eat(seed);
        if(fish.fishFood!=null){
            fish.swim();
        }

    }
}
