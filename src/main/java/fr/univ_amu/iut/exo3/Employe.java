package fr.univ_amu.iut.exo3;

import java.time.LocalDate;

public class Employe {
    private int numeroEmploye;
    private String numeroSecu;
    private String nomEmploye;
    private String prenomEmploye;
    private int echelonEmploye;
    private LocalDate dateDeNaissanceEmploye;
    private LocalDate dateEmbaucheEmploye;



    private double base;
    private double nbHeures;


    public Employe(int numeroEmploye, String numeroSecu, String nomEmploye, String prenomEmploye, int echelonEmploye, LocalDate dateDeNaissanceEmploye, LocalDate dateEmbaucheEmploye, double base, double nbHeures) {
        this.numeroEmploye = numeroEmploye;
        this.numeroSecu = numeroSecu;
        this.nomEmploye = nomEmploye;
        this.prenomEmploye = prenomEmploye;
        this.echelonEmploye = echelonEmploye;
        this.dateDeNaissanceEmploye = dateDeNaissanceEmploye;
        this.dateEmbaucheEmploye = dateEmbaucheEmploye;
        this.base = base;
        this.nbHeures = nbHeures;
    }

    public String afficher(){
        return
        "numéro Employé : " + numeroEmploye + "\n" +
        "numéro Sécurité : " + numeroSecu + "\n" +
        "Nom Employé : " + nomEmploye + "\n" +
        "Prénom Employé : " + prenomEmploye + "\n" +
        "Echelon Employé : " + echelonEmploye + "\n" +
        "Date de naissance Employé : " + dateDeNaissanceEmploye + "\n" +
        "Date d'embauche Employé : " + dateEmbaucheEmploye + "\n" +
        "Base de l'employé : "+ base + "\n" +
        "Nombre d'heures de l'employé : " + nbHeures + "\n"+
        "Salaire brut: "+ salaireBrut()+ "\n \n";
    }

    public double salaireBrut(){
        return (this.base * this.nbHeures)+100 ;
    }

    public double salaireNet(){
        return salaireBrut()*0.8;
    }

    public int getNumeroEmploye() {
        return numeroEmploye;
    }


    public String getNumeroSecu() {
        return numeroSecu;
    }


    public String getNomEmploye() {
        return nomEmploye;
    }

    public String getPrenomEmploye() {
        return prenomEmploye;
    }

    public int getEchelonEmploye() {
        return echelonEmploye;
    }

    public void setEchelonEmploye(int echelonEmploye) {
        this.echelonEmploye = echelonEmploye;
    }

    public LocalDate getDateDeNaissanceEmploye() {
        return dateDeNaissanceEmploye;
    }

    public LocalDate getDateEmbaucheEmploye() {
        return dateEmbaucheEmploye;
    }

    public double getBase() {
        return base;
    }

    public double getNbHeures() {
        return nbHeures;
    }

}
