package fr.univ_amu.iut.exo3;

import java.time.LocalDate;

public class Commercial extends Employe {




    private double chiffreAffaires;
    private double tauxCommission;

    public Commercial(int numeroEmploye, String numeroSecu, String nomEmploye, String prenomEmploye, int echelonEmploye, LocalDate dateDeNaissanceEmploye,
                      LocalDate dateEmbaucheEmploye, double base, double nbHeures) {
        super(numeroEmploye, numeroSecu, nomEmploye, prenomEmploye, echelonEmploye, dateDeNaissanceEmploye, dateEmbaucheEmploye, base, nbHeures);
    }

    public void negocierTransaction(){
        System.out.println("J\'effectue une transaction");
    }

    @Override
    public double salaireBrut() {
        return getBase()+100+chiffreAffaires*tauxCommission;
    }

    public double getChiffreAffaires() {
        return chiffreAffaires;
    }

    public double getTauxCommission() {
        return tauxCommission;
    }
    public void setChiffreAffaires(double chiffreAffaires) {
        this.chiffreAffaires = chiffreAffaires;
    }

    public void setTauxCommission(double tauxCommission) {
        this.tauxCommission = tauxCommission;
    }
}
