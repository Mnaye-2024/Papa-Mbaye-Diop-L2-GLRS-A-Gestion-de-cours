package entites;

public class Etudiant {
    private String nom;
    private String prenom;
    private String dob; 
    private static int nombreEtudiants;

    public Etudiant(String nom, String prenom, String dob) {
        this.nom = nom;
        this.prenom = prenom;
        this.dob = dob;
        nombreEtudiants++;
    }

    public Etudiant(String nom2, String prenom2) {
    }

    // Getters and setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public static int getNombreEtudiants() {
        return nombreEtudiants;
    }

    @Override
    public String toString() {
        return "Nom : " + nom + ", Prénom : " + prenom + ", Date de naissance : " + dob;
    }
}
