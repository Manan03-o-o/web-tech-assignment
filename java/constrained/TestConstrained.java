package constrained;

import java.beans.*;

public class TestConstrained {
    public static void main(String[] args) {

        PersonConstrained p = new PersonConstrained();

        p.addVetoableChangeListener(evt -> {
            int newAge = (int) evt.getNewValue();

            if (newAge < 18) {
                throw new PropertyVetoException("Age must be >= 18", evt);
            }
        });

        try {
            p.setAge(20);
            System.out.println("Age set to 20");

            p.setAge(15); 
        } catch (PropertyVetoException e) {
            System.out.println(e.getMessage());
        }
    }
}