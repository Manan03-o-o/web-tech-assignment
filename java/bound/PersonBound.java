package bound;

import java.beans.*;

public class PersonBound {

    private String name;
    private PropertyChangeSupport support = new PropertyChangeSupport(this);

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        String oldName = this.name;
        this.name = newName;

        support.firePropertyChange("name", oldName, newName);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}