package exceptions.ue.transporter;

class Starship {
    private String name;
    private Transporter transporter;

    public Starship(String name, Transporter transporter) {
        this.name = name;
        this.transporter = transporter;
    }

    public void beamUp(String person, String from) {
        try {
            transporter.beam(person, from, "Enterprise", true);
        } catch (TransporterMalfunctionException e) {
            System.out.println("Beam-Vorgang fehlgeschlagen: Transporter ausgefallen.");
        } finally {
            transporter.shutdown();
        }
    }
}
