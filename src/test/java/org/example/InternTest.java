package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InternTest {

    @Test
    void sortByFirstName() {
        Intern[] expected = new Intern[6];
        expected[0] = new Intern("Anna Brita", "Ani", 23, Food.JAPANESE);
        expected[1] = new Intern("Daniil", "Starov", 41, Food.EUROPEAN);
        expected[2] = new Intern("Liis", "Usin", 33, Food.INDIAN);
        expected[3] = new Intern("Liis", "Schotter", 33, Food.JAPANESE);
        expected[4] = new Intern("Madli", "Petuhhov", 34, Food.ITALIAN);
        expected[5] = new Intern("Mikk", "Sarv", 37, Food.EUROPEAN);

        Intern[] actual = getInternList();
        Arrays.sort(actual, Intern.byFirstName);
        assertArrayEquals(expected, actual);
    }

    @Test
    void sortByFoodPopularity() {
        Intern[] expected = new Intern[6];
        expected[0] = new Intern("Madli", "Petuhhov", 34, Food.ITALIAN);
        expected[1] = new Intern("Liis", "Usin", 33, Food.INDIAN);
        expected[2] = new Intern("Liis", "Schotter", 33, Food.JAPANESE);
        expected[3] = new Intern("Anna Brita", "Ani", 23, Food.JAPANESE);
        expected[4] = new Intern("Mikk", "Sarv", 37, Food.EUROPEAN);
        expected[5] = new Intern("Daniil", "Starov", 41, Food.EUROPEAN);

        Intern[] actual = getInternList();
        Arrays.sort(actual, Intern.byFoodPopularity);
        assertArrayEquals(expected, actual);
    }

    @Test
    void sortByFirstNameAndLastNameLengthAndByLastName() {
        Intern[] expected = new Intern[6];
        expected[0] = new Intern("Mikk", "Sarv", 37, Food.EUROPEAN);
        expected[1] = new Intern("Liis", "Usin", 33, Food.INDIAN);
        expected[2] = new Intern("Liis", "Schotter", 33, Food.JAPANESE);
        expected[3] = new Intern("Madli", "Petuhhov", 34, Food.ITALIAN);
        expected[4] = new Intern("Daniil", "Starov", 41, Food.EUROPEAN);
        expected[5] = new Intern("Anna Brita", "Ani", 23, Food.JAPANESE);

        Intern[] actual = getInternList();
        Arrays.sort(actual, Intern.byFirstNameLength
                .thenComparing(Intern.byLastNameLength)
                .thenComparing(Intern.byLastName));
        assertArrayEquals(expected, actual);
    }


    private Intern[] getInternList() {
        Intern[] interns = new Intern[6];
        interns[0] = new Intern("Liis", "Usin", 33, Food.INDIAN);
        interns[1] = new Intern("Liis", "Schotter", 33, Food.JAPANESE);
        interns[2] = new Intern("Anna Brita", "Ani", 23, Food.JAPANESE);
        interns[3] = new Intern("Madli", "Petuhhov", 34, Food.ITALIAN);
        interns[4] = new Intern("Mikk", "Sarv", 37, Food.EUROPEAN);
        interns[5] = new Intern("Daniil", "Starov", 41, Food.EUROPEAN);
        return interns;
    }
}