import java.util.UUID;

public class Vehicule {
    private String matricule;
    private float carburant;
    private int modele;
    private boolean panne;
    private boolean vendu;

    public Vehicule(int modele) {
        this.modele = modele;
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

    @Override
    public String toString() {
        return "Vehicule{" +
                "matricule='" + matricule + '\'' +
                ", carburant=" + carburant +
                ", modele=" + modele +
                ", panne=" + panne +
                ", vendu=" + vendu +
                '}';
    }

    public void afficher() {
        System.out.println("********** Vehicule **********");
        System.out.println(">> Matricule : " + this.getMatricule());
        System.out.println(">> Modele    : " + this.getModele());
        System.out.println(">> Carburant : " + this.getCarburant());
        System.out.println(">> Panne     : " + this.isPanne());
        System.out.println(">> Vendu     : " + this.isVendu());
        System.out.println("******************************\n");
    }
}
