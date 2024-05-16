package Vue;

import java.util.List;
import java.util.Scanner;

import entites.Professeur;

public class AdminVue {
    private final Scanner scanner;

    public AdminVue() {
        this.scanner = new Scanner(System.in);
    }

    public Professeur saisieProfesseur() {
        System.out.println("Ajouter un Professeur :");
        System.out.print("Nom : ");
        String nom = scanner.nextLine();
        System.out.print("Prénom : ");
        String prenom = scanner.nextLine();
        System.out.print("Matière enseignée : ");
        String matiere = scanner.nextLine();
        return new Professeur(nom, prenom, matiere);
    }

    public void afficherProfesseurs(List<Professeur> professeurs) {
        System.out.println("Liste des Professeurs :");
        for (Professeur professeur : professeurs) {
            System.out.println(professeur);
        }
    }
}
