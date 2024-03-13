package exceptions.ue.transporter;

public class Episode42Demo {

        public static void main(String[] args) {
            Transporter transporter = new Transporter();
            Starship enterprise = new Starship("Enterprise", transporter);

            // Beispiel-Beam-Vorgang
            enterprise.beamUp("Captain Kirk", "Riga IV");

        }
}
