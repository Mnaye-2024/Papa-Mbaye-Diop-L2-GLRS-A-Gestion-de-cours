package services;

import java.util.ArrayList;
import java.util.List;
import entites.Professeur;
import entites.Cours;

public class AdminService {

    private List<Professeur> professeurs = new ArrayList<>();
    private List<Cours> cours = new ArrayList<>();

    public boolean ajouterProfesseur(Professeur professeur) {
        return professeurs.add(professeur);
    }

    public boolean creerCours(Cours cours) {
        return this.cours.add(cours);
    }

    public List<Professeur> listerProfesseurs() {
        return new ArrayList<>(professeurs);
    }

    public List<Cours> listerCours() {
        return new ArrayList<>(cours);
    }
}
