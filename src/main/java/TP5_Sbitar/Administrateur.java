package TP5_Sbitar;
import java.util.*;

public class Administrateur {
    private String nom;
    private int id;
    private static int i = 0;


    private List<Medecin> list_medecin;
    private List<Patient> list_patient;

    public Administrateur() {
        this.id = this.i++;
        this.list_medecin = new ArrayList();
        this.list_patient = new ArrayList();
    }

    public Administrateur(String nom) {
        this.id = this.i++;
        this.nom = nom;

        this.list_medecin = new ArrayList();
        this.list_patient = new ArrayList();

    }

}
