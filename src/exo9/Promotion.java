package exo9;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 
 */
public class Promotion {

    /**
     * Default constructor
     */
    public Promotion() {
    }

    @Override
    public String toString() {
        return "Promotion{" +
                "Etudiants=" + Etudiants +
                '}';
    }

    /**
     * 
     */
    public ArrayList<Etudiant> Etudiants = new ArrayList<>();

    /**
     * @return
     */
    public ArrayList<Etudiant> triParId() {
        ArrayList<Etudiant> idList = new ArrayList<>();
        ArrayList<Etudiant> temp_list = this.Etudiants;
        while (temp_list.size() >= 1) {
            int lowestId = Integer.MAX_VALUE;
            Etudiant etuWithLowestId = null;
            for (Etudiant e : temp_list) {
                if (e.getId() < lowestId) {
                    lowestId = e.getId();
                    etuWithLowestId = e;
                }
            }
            idList.add(etuWithLowestId);
            temp_list.remove(etuWithLowestId);


        }
        return idList;
    }

    /**
     * @return
     */
    public ArrayList<Etudiant> triParNom() {
        // TreeMap to store values of HashMap
        TreeMap<String, Etudiant> sorted = new TreeMap<>();
        for (Etudiant e: this.Etudiants) {
            sorted.put(e.getName(), e);
        }


        // Copy all data from hashMap into TreeMap

        ArrayList<Etudiant> list = new ArrayList<>();

        for (Etudiant e: sorted.values()) {
            list.add(e);
        }

        return list;

    }

}