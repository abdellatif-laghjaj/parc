public class Camion extends Vehicule {
    private int capacite;
    public static int nbMaxCamion = 10;
    public static int nbCamions = 0;

    public Camion(int modele) {
        super(modele);
        nbCamions++;
        this.setMatricule("Camion-" + nbCamions);
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void addCarburant(float c) {
        if (this.getCarburant() + c < this.capacite) {
            this.setCarburant(this.getCarburant() + c);
        } else {
            this.setCarburant(this.capacite);
        }
    }

    public Camion creeCamion(int m) {
        if (nbCamions < nbMaxCamion) {
            Camion camion = new Camion(m);
            nbCamions++;
            return camion;
        }
        return null;
    }

    public int getCapacite() {
        return capacite;
    }
}
