package fr.univ_amu.iut.exo3;

import java.time.LocalDate;

public class EmployeOrdinaire extends Employe {


    public EmployeOrdinaire(int numeroEmploye, String numeroSecu, String nomEmploye, String prenomEmploye, int echelonEmploye,
                            LocalDate dateDeNaissanceEmploye, LocalDate dateEmbaucheEmploye, double base, double nbHeures) {
        super(numeroEmploye, numeroSecu, nomEmploye, prenomEmploye, echelonEmploye, dateDeNaissanceEmploye, dateEmbaucheEmploye, base, nbHeures);
    }
    public void effectuerTacheOrdinaire(){
        System.out.println("J\'effectue une tache ordinaire");
    }

    @Override
    public double salaireBrut() {
        return super.salaireBrut()+ (getEchelonEmploye()*100);
    }
}
