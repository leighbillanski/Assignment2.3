package za.ac.cput;

public class Lion implements Animal {


    @Override
    public String eat(String food) {

        return food;
    }

    public void walking(){

        System.out.println("I can walk!");

    }

}
