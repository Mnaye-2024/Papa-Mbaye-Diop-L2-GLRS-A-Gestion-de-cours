package entites;

import java.time.LocalDate;
import java.time.LocalTime;

public class SessionCours {
    private LocalDate date;
    private LocalTime heureDebut;
    private LocalTime heureFin;
    private String salle;

    public SessionCours(LocalDate date, LocalTime heureDebut, LocalTime heureFin, String salle) {
        this.date = date;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
        this.salle = salle;
    }


    public SessionCours(String date2, String heureDebut2, String heureFin2) {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(LocalTime heureDebut) {
        this.heureDebut = heureDebut;
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }

    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }

    public String getSalle() {
        return salle;
    }

    public void setSalle(String salle) {
        this.salle = salle;
    }
}
