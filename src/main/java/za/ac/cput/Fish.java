package za.ac.cput;

public class Fish implements Animal {

    String fishFood = null;
    @Override
    public String eat(String food) {

        fishFood = food;
        return fishFood;
    }

    public void swim(){

        System.out.println("I can swim.");

    }

}
