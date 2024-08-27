package TP5_Sbitar;

public class Patient {
    private String nom;
    private int id;
    private static int i = 0;

    public Patient(String nom) {
        this.id = this.i++;
        this.nom = nom;

    }

    public Patient() {
    }



}
