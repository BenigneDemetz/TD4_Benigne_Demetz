package exo9;

import java.util.*;

/**
 * 
 */
public class Etudiant {

    @Override
    public String toString() {
        return "Etudiant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }

    /**
     * Default constructor
     */
    public Etudiant(String nom, String prenom) {
        this.id = ++lastId;
        this.nom = nom;
        this.prenom = prenom;
    }

    /**
     * 
     */
    private static int lastId = 0;

    private int id;

    /**
     * 
     */
    private String nom;

    /**
     * 
     */
    private String prenom;


    /**
     * @return
     */
    public int getId() {

        return this.id;
    }

    /**
     * @return
     */
    public String getName() {

        return this.nom;
    }

}