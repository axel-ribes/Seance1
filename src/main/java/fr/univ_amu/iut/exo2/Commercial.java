package fr.univ_amu.iut.exo2;

import java.time.LocalDate;

public class Commercial extends Employe {

    public Commercial(int numeroEmploye, String numeroSecu, String nomEmploye, String prenomEmploye, int echelonEmploye, LocalDate dateDeNaissanceEmploye,
                      LocalDate dateEmbaucheEmploye, double base, double nbHeures) {
        super(numeroEmploye, numeroSecu, nomEmploye, prenomEmploye, echelonEmploye, dateDeNaissanceEmploye, dateEmbaucheEmploye, base, nbHeures);
    }

}
