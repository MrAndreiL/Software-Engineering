package com.company;
import java.util.ArrayList;

public class Pacient extends Om{
    String disease;

    // Array of doctors the patient is registered to.
    ArrayList<Doctor> doctors = new ArrayList<Doctor>();

    public Pacient(String nume, int varsta, String disease) {
        super(nume, varsta);
        this.disease = disease;
    }

    /* Getters */
    public String getDisease() {
        return disease;
    }

    public void getInfo() {
        String response = nume + " " + varsta.toString() + " " + disease;
        System.out.println(response);
    }

    public void getDoctors() {
        for (Doctor d : doctors) {
            System.out.println("Doctorul: " + d.nume + " " + d.spec);
        }
    }

    /* Setters */
    public void setNewDoctor(Doctor d) {
        doctors.add(d);
    }
}
