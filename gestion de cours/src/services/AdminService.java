package services;

import java.util.ArrayList;
import java.util.List;
import entites.Professeur;
import entites.Cours;

public class AdminService {

    private List<Professeur> professeurs = new ArrayList<>();
    private List<Cours> cours = new ArrayList<>();

    // Méthode pour ajouter un professeur
    public boolean ajouterProfesseur(Professeur professeur) {
        return professeurs.add(professeur);
    }

    // Méthode pour créer un cours
    public boolean creerCours(Cours cours) {
        return this.cours.add(cours);
    }

    // Méthode pour afficher tous les professeurs
    public List<Professeur> listerProfesseurs() {
        return new ArrayList<>(professeurs);
    }

    // Méthode pour afficher tous les cours
    public List<Cours> listerCours() {
        return new ArrayList<>(cours);
    }
}
