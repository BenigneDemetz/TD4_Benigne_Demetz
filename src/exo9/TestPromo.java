package exo9;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TestPromo {

    //@Test
    public /**/static/**/ void main(String[] args) {

        Promotion promo = new Promotion();
        Etudiant etudiant1 = new Etudiant("Demetz", "Benigne");
        Etudiant etudiant2 = new Etudiant("Serpaggi", "Arnaud");
        Etudiant etudiant3 = new Etudiant("Martin", "Vincent");
        promo.Etudiants.add(etudiant3);
        promo.Etudiants.add(etudiant1);
        promo.Etudiants.add(etudiant2);
        System.out.println(promo.triParNom());
        //les etudiants sont triés de base


        //j'ai un problème avec junit elle refuse de s'importer

//        ArrayList<Etudiant> resultSortByName = new ArrayList<>();
//        resultSortByName.add(etudiant1);
//        resultSortByName.add(etudiant3);
//        resultSortByName.add(etudiant2);
//        assertEquals(promo.triParNom(), resultSortByName);
    }

}
