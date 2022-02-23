package com.company;
import java.util.ArrayList;

public class Doctor extends Om{
    // Doctor's spec.
    String spec;

    // Patient's list.
    ArrayList<Pacient> pacienti = new ArrayList<Pacient>();

    public Doctor (String nume, int varsta, String spec) {
        super(nume, varsta);
        this.spec = spec;
    }

    /* Getters */
    public String getSpec() {
        return spec;
    }

    public void getInfo() {
        String response = nume + " " + varsta.toString() + " " + spec;
        System.out.println(response);
    }

    // Retrieve the list of patients.
    public void getPatients() {
        for (Pacient p : pacienti) {
            System.out.println("Pacientul: " + p.nume + " " + p.disease);
        }
    }

    /* Setters */
    public void setNewPatient(Pacient p) {
        pacienti.add(p);
    }
}
