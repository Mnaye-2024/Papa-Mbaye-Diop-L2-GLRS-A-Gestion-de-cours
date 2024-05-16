package Vue;

import java.util.List;
import java.util.Scanner;

import entites.Etudiant;
import entites.SessionCours;

public class AttacheVue {
    private final Scanner scanner;

    public AttacheVue() {
        this.scanner = new Scanner(System.in);
    }

    public Etudiant saisieEtudiant() {
        System.out.println("Ajouter un Etudiant :");
        System.out.print("Nom : ");
        String nom = scanner.nextLine();
        System.out.print("Prénom : ");
        String prenom = scanner.nextLine();
        // Ajoutez d'autres informations à saisir si nécessaire
        return new Etudiant(nom, prenom);
    }

    public void afficherEtudiants(List<Etudiant> etudiants) {
        System.out.println("Liste des Etudiants :");
        for (Etudiant etudiant : etudiants) {
            System.out.println(etudiant);
        }
    }

    public SessionCours saisieSessionCours() {
        System.out.println("Créer une Session de Cours :");
        System.out.print("Date (YYYY-MM-DD) : ");
        String date = scanner.nextLine();
        System.out.print("Heure de début (HH:MM) : ");
        String heureDebut = scanner.nextLine();
        System.out.print("Heure de fin (HH:MM) : ");
        String heureFin = scanner.nextLine();
        // Ajoutez d'autres informations à saisir si nécessaire
        return new SessionCours(date, heureDebut, heureFin);
    }

    public void afficherSessionsCours(List<SessionCours> sessionsCours) {
        System.out.println("Liste des Sessions de Cours :");
        for (SessionCours sessionCours : sessionsCours) {
            System.out.println(sessionCours);
        }
    }
}
