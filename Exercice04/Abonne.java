package Exercice04;

class Abonne {
    private String nom;
    private String numeroTelephone;

    public Abonne(String nom, String numeroTelephone) {
        this.nom = nom;
        this.numeroTelephone = numeroTelephone;
    }

    public String getNom() {
        return nom;
    }

    public String getNumeroTelephone() {
        return numeroTelephone;
    }
}