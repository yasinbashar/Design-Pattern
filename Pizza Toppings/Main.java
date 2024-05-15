package Pizza_Toppings;

public class Main {
    public static void main(String[] args) {


        Pizza moja = new Mojar_Pizza();
        moja.make();
        moja.addTopping("moja");
        moja.addTopping("sauce");
        moja.addTopping("mutton");




        // Creating Vegetarian pizza and adding toppings
        Pizza cheezy = new cheezy_Pizza();
        cheezy.make();
        cheezy.addTopping("cheese");
        cheezy.addTopping("meonize");
        cheezy.addTopping("sauce");

    }
}
