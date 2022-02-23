package com.company;

public class Om {
     String nume;
     Integer varsta;

     // Default constructor.
     public Om(String nume, int varsta) {
         this.nume   = nume;
         if (0 <= varsta && varsta <= 100) {
             this.varsta = varsta;
         } else {
             this.varsta = 0;
         }
     }

     /* Getters */
    public String getName() {
        return nume;
    }

    public int getAge() {
        return varsta;
    }
}
