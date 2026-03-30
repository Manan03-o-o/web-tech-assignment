package constrained;

import java.beans.*;

public class PersonConstrained {

    private int age;
    private VetoableChangeSupport support = new VetoableChangeSupport(this);

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) throws PropertyVetoException {

        support.fireVetoableChange("age", this.age, newAge);
        this.age = newAge;
    }

    public void addVetoableChangeListener(VetoableChangeListener listener) {
        support.addVetoableChangeListener(listener);
    }
}