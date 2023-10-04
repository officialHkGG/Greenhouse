import javax.swing.*;

public class Växthotell {
    public static void main(String[] args) {

        String växtNamn = JOptionPane.showInputDialog("Vilken växt ska få mat?");
        double växtLängd = Double.parseDouble(JOptionPane.showInputDialog("Ange längd på växten (i meter):"));


        Växt växt;
        switch (växtNamn.toLowerCase()) {
            case "laura":
                växt = new Palm(växtLängd);
                break;
            case "meatloaf":
                växt = new KöttätandeVäxt(växtLängd);
                break;
            case "igge":
                växt = new Kaktus();
                break;
            case "olof":
                växt = new Palm(växtLängd);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Okänd växttyp.");
                return;
        }

        // Beräkna vätskemängd och föredragen vätska för växten
        double vätskeMängd = växt.beräknaVätskemängd();
        Vätsketyp föredragenVätska = växt.angeFöredragenVätska();

        // Visa resultatet
        String resultatMeddelande = String.format("Växten ska få %.2f liter %s.", vätskeMängd, föredragenVätska.name().toLowerCase());
        JOptionPane.showMessageDialog(null, resultatMeddelande);
    }
}