package org.example;

import java.util.Comparator;

public record Intern(String firstName, String lastName, int age, Food food) {
    public static Comparator<Intern> byFirstName = Comparator.comparing(o -> o.firstName);

    public static Comparator<Intern> byLastName = (o1, o2) -> o1.lastName.compareTo(o2.lastName);

    public static Comparator<Intern> byFirstNameLength = Comparator.comparingInt(o -> o.firstName.length());

    public static Comparator<Intern> byLastNameLength = Comparator.comparingInt(o -> o.lastName.length());

    public static Comparator<Intern> byAge = new Comparator<Intern>() {
        @Override
        public int compare(Intern o1, Intern o2) {
            return o1.age- o2.age;
        }
    };

    public static Comparator<Intern> byFood = new Comparator<Intern>() {
        @Override
        public int compare(Intern o1, Intern o2) {
            return o1.food.compareTo(o2.food);
        }
    };

    public static Comparator<Intern> byFoodPopularity = new Comparator<Intern>() {
        @Override
        public int compare(Intern o1, Intern o2) {
            return o1.food.order - o2.food.order;
        }
    };

    @Override
    public String toString() {
        return "\n" + firstName + " " + lastName + ", " + age + ", " + food;

    }
}
