import javax.naming.Name;

public class Osterhase extends Hase{

    public Osterhase(String name) {
        super(name);
    }

    @Override
    public void verteilen() {
        System.out.println(getName() +  "versteckt Genschenke und Ostereier");
    }
}
