import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entites.Cours;
import entites.Professeur;

public class App {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Professeur> professeurs = new ArrayList<>();
    private static final List<Cours> cours = new ArrayList<>();

    public static void main(String[] args) {
        boolean continuer = true;
        while (continuer) {
            afficherMenu();
            int choix = scanner.nextInt();
            scanner.nextLine(); 
            
            switch (choix) {
                case 1:
                    ajouterProfesseur();
                    break;
                case 2:
                    listerProfesseurs();
                    break;
                case 3:
                    creerCours();
                    break;
                case 4:
                    listerCours();
                    break;
                case 5:
                    listerCoursProfesseur();
                    break;
                case 6:
                    continuer = false;
                    System.out.println("Programme terminé.");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez réessayer.");
                    break;
            }
        }
    }

    private static void afficherMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Ajouter un Professeur");
        System.out.println("2. Lister les Professeurs");
        System.out.println("3. Créer un cours");
        System.out.println("4. Lister tous les cours");
        System.out.println("5. Lister les cours d'un professeur");
        System.out.println("6. Quitter");
        System.out.print("Choix : ");
    }

    private static void ajouterProfesseur() {
        System.out.println("\nAjouter un Professeur :");
        System.out.print("Nom : ");
        String nom = scanner.nextLine();
        System.out.print("Prénom : ");
        String prenom = scanner.nextLine();
        Professeur professeur = new Professeur(nom, prenom, prenom);
        professeurs.add(professeur);
        System.out.println("Professeur ajouté avec succès !");
    }

    private static void listerProfesseurs() {
        System.out.println("\nListe des Professeurs :");
        for (Professeur professeur : professeurs) {
            System.out.println(professeur);
        }
    }

    private static void creerCours() {
        System.out.println("\nCréer un cours :");
        System.out.print("ID du cours : ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        System.out.print("Date (YYYY-MM-DD) : ");
        String dateStr = scanner.nextLine();
        LocalDate date = LocalDate.parse(dateStr);
        System.out.print("Heure de début (HH:MM) : ");
        String heureDebutStr = scanner.nextLine();
        LocalTime heureDebut = LocalTime.parse(heureDebutStr);
        System.out.print("Heure de fin (HH:MM) : ");
        String heureFinStr = scanner.nextLine();
        LocalTime heureFin = LocalTime.parse(heureFinStr);
        System.out.print("ID du professeur : ");
        int idProfesseur = scanner.nextInt();
        Professeur professeur = trouverProfesseurParId(idProfesseur);
        if (professeur != null) {
            Cours nouveauCours = new Cours(id, date, heureDebut, heureFin, professeur, null, heureFinStr);
            cours.add(nouveauCours);
            System.out.println("Cours créé avec succès !");
        } else {
            System.out.println("Aucun professeur trouvé avec l'ID spécifié.");
        }
    }

    private static void listerCours() {
        System.out.println("\nListe de tous les cours :");
        for (Cours cours : cours) {
            System.out.println(cours);
        }
    }

    private static void listerCoursProfesseur() {
        System.out.print("\nID du professeur : ");
        int idProfesseur = scanner.nextInt();
        Professeur professeur = trouverProfesseurParId(idProfesseur);
        if (professeur != null) {
            System.out.println("\nCours du Professeur " + professeur.getNom() + " " + professeur.getPrenom() + " :");
            boolean found = false;
            for (Cours cours : cours) {
                if (cours.getProfesseur().equals(professeur)) {
                    System.out.println(cours);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Aucun cours trouvé pour ce professeur.");
            }
        } else {
            System.out.println("Aucun professeur trouvé avec l'ID spécifié.");
        }
    }

    private static Professeur trouverProfesseurParId(int id) {
        for (Professeur professeur : professeurs) {
            if (professeur.getId() == id) {
                return professeur;
            }
        }
        return null;
    }
}
