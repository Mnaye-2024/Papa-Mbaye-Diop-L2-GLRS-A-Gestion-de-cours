package services;

import java.util.ArrayList;
import java.util.List;
import entites.Etudiant;
import entites.SessionCours;

public class AttacheService {

    private List<Etudiant> etudiants = new ArrayList<>();
    private List<SessionCours> sessionsCours = new ArrayList<>();

    public boolean inscrireEtudiant(Etudiant etudiant) {
        return etudiants.add(etudiant);
    }

    public boolean planifierSessionCours(SessionCours sessionCours) {
        return sessionsCours.add(sessionCours);
    }

    public List<Etudiant> listerEtudiants() {
        return new ArrayList<>(etudiants);
    }

    public List<SessionCours> listerSessionsCours() {
        return new ArrayList<>(sessionsCours);
    }
}
