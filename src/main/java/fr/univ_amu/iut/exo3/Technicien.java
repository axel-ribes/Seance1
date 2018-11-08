package fr.univ_amu.iut.exo3;

import java.time.LocalDate;

public class Technicien extends Employe {




    private int nbUnitesProduites;
    private double tauxCommissionUnite;

    public Technicien(int numeroEmploye, String numeroSecu, String nomEmploye, String prenomEmploye, int echelonEmploye, LocalDate dateDeNaissanceEmploye,
                      LocalDate dateEmbaucheEmploye, double base, double nbHeures) {
        super(numeroEmploye, numeroSecu, nomEmploye, prenomEmploye, echelonEmploye, dateDeNaissanceEmploye, dateEmbaucheEmploye, base, nbHeures);
    }

    public void fabriquerProduit() {
        System.out.println("Je fabrique un produit");
    }

    @Override
    public double salaireBrut() {
        return super.salaireBrut()+nbUnitesProduites*tauxCommissionUnite;
    }



    public int getNbUnitesProduites() {
        return nbUnitesProduites;
    }

    public double getTauxCommissionUnite() {
        return tauxCommissionUnite;
    }
    public void setNbUnitesProduites(int nbUnitesProduites) {
        this.nbUnitesProduites = nbUnitesProduites;
    }

    public void setTauxCommissionUnite(double tauxCommissionUnite) {
        this.tauxCommissionUnite = tauxCommissionUnite;
    }
}
