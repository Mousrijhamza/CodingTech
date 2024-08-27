package TP5_Sbitar;

import java.util.ArrayList;

public class Medecin {
    private String nom;
    private int id;
    private static int i = 0;

    public Medecin(String nom) {
        this.id = this.i++;
        this.nom = nom;

    }

    public Medecin() {
    }

}
