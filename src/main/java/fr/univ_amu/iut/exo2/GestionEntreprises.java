package fr.univ_amu.iut.exo2;

import java.time.LocalDate;
import java.util.ArrayList;

public class GestionEntreprises {
    public static void main(String[] args) {
        LocalDate dateNaissanceAxel = LocalDate.of(2000,01,13);
        LocalDate dateEmbaucheAxel = LocalDate.of(2000,01,12);
        Employe Axel = new Employe(13,"1234567890","RIBES","axel",99,dateNaissanceAxel,dateEmbaucheAxel,10,1200);
        Employe Theo = new Employe(0,"1","POUJOL","Theo",0,dateNaissanceAxel,dateEmbaucheAxel,1,1200);


        ArrayList lesEmployes = new ArrayList<Employe>();
        Entreprise maboiteInfor = new Entreprise("maBoiteInfo",lesEmployes);
        maboiteInfor.nouvelEmploye(Axel);
        maboiteInfor.nouvelEmploye(Theo);
        System.out.println(maboiteInfor);
    }
}