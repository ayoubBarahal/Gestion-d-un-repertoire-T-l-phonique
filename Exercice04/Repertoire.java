package Exercice04;

import java.util.Arrays;
import java.util.Comparator;

class Repertoire {
    private int MaxAbonne;
    private Abonne[] abonnes ;
    private static int nbrabonne=0;

    public Repertoire(int MaxAbonne) {
        this.MaxAbonne = MaxAbonne;
        this.abonnes = new Abonne[MaxAbonne];

    }

    public boolean addAbonne(Abonne abonne) {

        if (nbrabonne < MaxAbonne) {
            abonnes[nbrabonne]=abonne;
            nbrabonne++;
            return true;
        }
        return false;

    }

    public String getNumero(String nom) {
        for (int i=0 ; i<MaxAbonne;i++) {
            if ( abonnes[i]!=null && abonnes[i].getNom().equalsIgnoreCase(nom)) {
                return abonnes[i].getNumeroTelephone();
            }
        }
        return null;
    }

    public int getNbAbonnes() {
        return abonnes.length;
    }

    public Abonne getAbonne(int rang) {
        if (rang >= 0 && rang < abonnes.length) {
            return abonnes[rang];
        }
        return null;
    }

    public void getAbonnesTries() {
        for (int i = 0; i < nbrabonne - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nbrabonne; j++) {
                if (abonnes[j].getNom().compareToIgnoreCase(abonnes[minIndex].getNom()) < 0) {
                    minIndex = j;
                }
            }
            Abonne temp = abonnes[minIndex];
            abonnes[minIndex] = abonnes[i];
            abonnes[i] = temp;
        }
    }

}
