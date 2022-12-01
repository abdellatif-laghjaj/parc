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
            if (this.T[i] != null && this.T[i].getMatricule().equals(matricule)) {
                index = i;
                break;
            }
        }

        return index;
    }

    public void lister() {
        for (int i = 0; i < this.T.length; i++) {
            if (this.T[i] != null) {
                this.T[i].afficher();
            }
        }
    }

    public static void main(String[] args) {
        Parc parc = new Parc("Rue de la Paix", 10);
        Voiture voiture_1 = new Voiture(2010);
        Voiture voiture_2 = new Voiture(2011);

        Camion camion_1 = new Camion(2012);
        Camion camion_2 = new Camion(2013);
        Camion camion_3 = new Camion(2014);

        parc.ajouter(voiture_1);
        parc.ajouter(voiture_2);
        parc.ajouter(camion_1);
        parc.ajouter(camion_2);
        parc.ajouter(camion_3);

        parc.lister();

        int found_voiture = parc.rechercher("Voiture-1");
        int found_camion = parc.rechercher("Camion-2");

        if (found_voiture == -1) {
            System.out.println("Voiture non trouvée");
        } else {
            System.out.println("Voiture est trouvé dans la position " + (found_voiture + 1) + ", et voici ses informations:");
            parc.T[found_voiture].afficher();
        }

        if (found_camion == -1) {
            System.out.println("Camion non trouvé");
        } else {
            System.out.println("Camion est trouvé dans la position " + (found_camion + 1) + ", et voici ses informations:");
            parc.T[found_camion].afficher();
        }
    }
}