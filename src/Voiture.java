public class Voiture extends Vehicule {
    private int capacite;
    public static int nbMaxVoiture = 10;
    public static int nbVoitures = 0;

    public Voiture(int modele) {
        super(modele);
    }

    public void addCarburant(float c) {
        if (this.getCarburant() + c < this.capacite) {
            this.setCarburant(this.getCarburant() + c);
        } else {
            this.setCarburant(this.capacite);
        }
    }

    public Voiture creeVoiture(int m) {
        if (nbVoitures < nbMaxVoiture) {
            Voiture voiture = new Voiture(m);
            nbVoitures++;
            return voiture;
        }
        return null;
    }

    public int getCapacite() {
        return capacite;
    }
}
