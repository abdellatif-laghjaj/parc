public class Parc {
    public String adresse;
    public int capacite;
    public Vehicule[] T;

    public Parc(String adresse, int capacite) {
        this.adresse = adresse;
        this.capacite = capacite;
        this.T = new Vehicule[capacite];
    }

    public void ajouter(Vehicule vehicule) {
        for (int i = 0; i < this.T.length; i++) {
            if (this.T[i] == null) {
                this.T[i] = vehicule;
                break;
            }
        }
    }

    public int rechercher(String matricule) {
        int index = -1;

        for (int i = 0; i < this.T.length; i++) {
            if (this.T[i].getMatricule() == matricule) {
                index = (i + 1);
                break;
            }
        }

        return index;
    }

    public void lister() {
        for (int i = 0; i < this.T.length; i++) {
            this.T[i].afficher();
        }
    }

    public static void main(String[] args) {
    }
}