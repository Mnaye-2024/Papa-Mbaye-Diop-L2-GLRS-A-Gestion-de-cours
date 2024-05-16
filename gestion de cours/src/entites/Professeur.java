package entites;

public class Professeur {
    private int id;
    private String nom;
    private String prenom;
    private String matiere;

    public Professeur(String nom, String prenom, String matiere) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.matiere = matiere;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    @Override
    public String toString() {
        return "Professeur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", matiere='" + matiere + '\'' +
                '}';
    }
}
