public class Hase {
    private String Name;


    public Hase(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void schlafen () {
        System.out.println(Name +"Schalft");
    }
    public void hoppeln () {
        System.out.println(Name + "Hoppelt");
    }
    public void fressen () {
        System.out.println(Name + "Frisst");};

    public void verteilen () {
        System.out.println(Name + "ist ein Hase und verteilt nichts");
    }



}
