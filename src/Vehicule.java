public class Vehicule {
    private String matricule;
    private float carburant;
    private int modele;
    private boolean panne;
    private boolean vendu;

    public Vehicule(int modele) {
        this.modele = modele;
        this.matricule = "A" + (int) (Math.random() * 1000000);
        this.carburant = 0;
        this.panne = false;
        this.vendu = false;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public float getCarburant() {
        return carburant;
    }

    public void setCarburant(float carburant) {
        this.carburant = carburant;
    }

    public int getModele() {
        return modele;
    }

    public void setModele(int modele) {
        this.modele = modele;
    }

    public boolean isPanne() {
        return panne;
    }

    public void setPanne(boolean panne) {
        this.panne = panne;
    }

    public boolean isVendu() {
        return vendu;
    }

    public void setVendu(boolean vendu) {
        this.vendu = vendu;
    }
}