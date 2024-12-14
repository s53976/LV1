public class Weihnachshase extends Hase {

    public Weihnachshase(String name) {
        super(name);
    }

    @Override
    public void verteilen() {
        System.out.println(getName() + "ist ein Weihnachtshase");
    }
}
