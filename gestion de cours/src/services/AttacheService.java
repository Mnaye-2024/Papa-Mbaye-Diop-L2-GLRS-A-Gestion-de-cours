package services;

import java.util.ArrayList;
import java.util.List;
import entites.Etudiant;
import entites.SessionCours;

public class AttacheService {

    private List<Etudiant> etudiants = new ArrayList<>();
    private List<SessionCours> sessionsCours = new ArrayList<>();

    // Méthode pour inscrire un étudiant
    public boolean inscrireEtudiant(Etudiant etudiant) {
        return etudiants.add(etudiant);
    }

    // Méthode pour planifier une session de cours
    public boolean planifierSessionCours(SessionCours sessionCours) {
        return sessionsCours.add(sessionCours);
    }

    // Méthode pour afficher tous les étudiants
    public List<Etudiant> listerEtudiants() {
        return new ArrayList<>(etudiants);
    }

    // Méthode pour afficher toutes les sessions de cours
    public List<SessionCours> listerSessionsCours() {
        return new ArrayList<>(sessionsCours);
    }
}
