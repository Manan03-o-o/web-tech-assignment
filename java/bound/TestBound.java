package bound;

public class TestBound {
    public static void main(String[] args) {

        PersonBound p = new PersonBound();

        p.addPropertyChangeListener(evt -> {
            System.out.println("Changed from " + evt.getOldValue() + " to " + evt.getNewValue());
        });

        p.setName("Karan");
        p.setName("Rahul");
    }
}