package fr.univ_amu.iut.exo3;

import java.util.ArrayList;

public class Entreprise {
    private String nom;
    private ArrayList<Employe> listEmployes = new ArrayList<Employe>();

    public Entreprise(String nom, ArrayList<Employe> listEmployes) {
        this.nom = nom;
        this.listEmployes = listEmployes;
    }

    public void nouvelEmploye(Employe nouvelemploye){
        listEmployes.add(nouvelemploye);
    }


    @Override
    public String toString() {
        String mesEmployes = "";
        for(Employe employe : listEmployes)
        {
            mesEmployes = mesEmployes + employe.afficher();
        }
        return "Notre entreprise " +
                 nom +
                " comporte " + "\n" + mesEmployes;
    }
}
