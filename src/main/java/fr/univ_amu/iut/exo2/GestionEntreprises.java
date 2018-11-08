package fr.univ_amu.iut.exo2;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionEntreprises {
    public static void main(String[] args) {

        LocalDate dateNaissanceAxel = LocalDate.of(2000,01,13);
        LocalDate dateEmbaucheAxel = LocalDate.of(2000,01,12);
        EmployeOrdinaire Axel = new EmployeOrdinaire(13,"1234567890","RIBES","axel",99,dateNaissanceAxel,dateEmbaucheAxel,10,140);
        Technicien Theo = new Technicien(0,"1","POUJOL","Theo",0,dateNaissanceAxel,dateEmbaucheAxel,10,140);
        Theo.setNbUnitesProduites(4);
        Theo.setTauxCommissionUnite(10);
        Representant Nathan = new Representant(0,"1","VIGNAL","Nathan",0,dateNaissanceAxel,dateEmbaucheAxel,10,140);
        Vendeur Sam = new Vendeur(0,"1","HOWELLS","Sam",0,dateNaissanceAxel,dateEmbaucheAxel,10,140);
        Sam.setChiffreAffaires(40000);
        Sam.setTauxCommission(0.05);

        ArrayList lesEmployes = new ArrayList<Employe>();
        Entreprise maboiteInfor = new Entreprise("maBoiteInfo",lesEmployes);
        maboiteInfor.nouvelEmploye(Axel);
        maboiteInfor.nouvelEmploye(Theo);
        maboiteInfor.nouvelEmploye(Nathan);
        maboiteInfor.nouvelEmploye(Sam);
        System.out.println(maboiteInfor);
    }
}