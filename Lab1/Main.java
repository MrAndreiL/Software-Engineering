package com.company;

public class Main {

    public static void main(String[] args) {
	    // Print doctor's info.
        Doctor doc1 = new Doctor("Andrei", 30, "Cardio");

        Doctor doc2 = new Doctor("Razvan", 31, "ORL");

        // Print patient's info.
        System.out.println("----- Informatiile pacientilor ------");
        Pacient p1 = new Pacient("Alex", 45, "Hipertensiune");
        p1.getInfo();
        register(p1, doc1, doc2);
        p1.getDoctors();

        Pacient p2 = new Pacient("Amalia", 65, "Nas");
        p2.getInfo();
        register(p2, doc1, doc2);
        p2.getDoctors();

        Pacient p3 = new Pacient("George", 15, "Ochi");
        p3.getInfo();
        register(p3, doc1, doc2);
        p3.getDoctors();

        // Schema doctorilor.
        System.out.println("----- Schema doctorilor ------");
        doc1.getInfo();
        doc1.getPatients();

        doc2.getInfo();
        doc2.getPatients();
    }

    static public void register(Pacient p, Doctor d1, Doctor d2) {
        if (p.getDisease().equals("Hipertensiune")) {
            p.setNewDoctor(d1);
            d1.setNewPatient(p);
        } else if (p.getDisease().equals("Nas") || p.getDisease().equals("Ochi")) {
            p.setNewDoctor(d2);
            d2.setNewPatient(p);
        }
    }
}
