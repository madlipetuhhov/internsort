package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Intern> interns = new ArrayList<>();
        interns.add(new Intern("Liis", "Usin", 33, Food.INDIAN));
        interns.add(new Intern("Liis", "Schotter", 33, Food.JAPANESE));
        interns.add(new Intern("Anna Brita", "Ani", 23, Food.JAPANESE));
        interns.add(new Intern("Madli", "Petuhhov", 34, Food.ITALIAN));
        interns.add(new Intern("Mikk", "Sarv", 37, Food.EUROPEAN));
        interns.add(new Intern("Daniil", "Starov", 41, Food.EUROPEAN));

        System.out.println(interns);
        interns.sort(Intern.byFirstNameLength
                .thenComparing(Intern.byLastNameLength)
                .thenComparing(Intern.byLastName));
//        interns.sort(Intern.byFoodPopularity);
//        interns.sort(Intern.byFoodPopularity);
        System.out.println(interns);
//        interns.sort(Intern.byLastName);
//        System.out.println(interns);

    }
}