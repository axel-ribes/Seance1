package fr.univ_amu.iut.exo3;

import java.time.LocalDate;

public class Representant extends Commercial {
    public Representant(int numeroEmploye, String numeroSecu, String nomEmploye, String prenomEmploye, int echelonEmploye, LocalDate dateDeNaissanceEmploye,
                        LocalDate dateEmbaucheEmploye, double base, double nbHeures) {
        super(numeroEmploye, numeroSecu, nomEmploye, prenomEmploye, echelonEmploye, dateDeNaissanceEmploye, dateEmbaucheEmploye, base, nbHeures);
    }

    @Override
    public double salaireBrut() {
        EmployeOrdinaire employeOrdinaire = new EmployeOrdinaire(super.getNumeroEmploye(),super.getNumeroSecu(),super.getNomEmploye(),super.getPrenomEmploye(),super.getEchelonEmploye(),
                super.getDateDeNaissanceEmploye(),super.getDateEmbaucheEmploye(),super.getBase(),super.getNbHeures());
        return employeOrdinaire.salaireBrut();
        
    }
}
