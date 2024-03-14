package Exercice04;

public class Main {
    public static void main(String[] args) {
        Repertoire repertoire = new Repertoire(5);

        Abonne abonne1 = new Abonne("ayoub", "0659521353");
        Abonne abonne2 = new Abonne("adam", "0652457820");
        Abonne abonne3 = new Abonne("wisal", "0759854632");

        repertoire.addAbonne(abonne1);
        repertoire.addAbonne(abonne2);
        repertoire.addAbonne(abonne3);

        System.out.println("Le Numéro de tele du Nom est :"+repertoire.getNumero("ayoub"));
        System.out.println("Le Nombres des abonnes est : "+repertoire.getNbAbonnes());
        if(repertoire.getAbonne(1)!=null){
        System.out.println("Abonne Numéro 1 est : "+repertoire.getAbonne(1).getNom());}

        System.out.println("Le Répertoire est : ");
        for (int i=0;i<repertoire.getNbAbonnes();i++) {
            if(repertoire.getAbonne(i)!=null) {
                System.out.println(repertoire.getAbonne(i).getNom() + ": " + repertoire.getAbonne(i).getNumeroTelephone());
            }
        }
        System.out.println("Le Répertoire Trié  est : ");
        repertoire.getAbonnesTries();
        for (int i=0;i<repertoire.getNbAbonnes();i++) {
            if(repertoire.getAbonne(i)!=null) {
            System.out.println(repertoire.getAbonne(i).getNom() + ": " + repertoire.getAbonne(i).getNumeroTelephone());
            }
        }

    }
}
