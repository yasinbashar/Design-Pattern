package Pizza_Toppings;
import java.lang.System;

public class Mojar_Pizza extends Pizza {
    @Override
    public void addTopping(String topping) {
        System.out.println("Adding " + topping + " to Mojar pizza");
    }
}

