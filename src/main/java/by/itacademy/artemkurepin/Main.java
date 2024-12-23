package by.itacademy.artemkurepin;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Moscow");
        cities.add("Minsk");
        cities.add("New York");
        cities.add("Brest");
        cities.add("Ghomel");
        System.out.println(cities);
        cities.set(2, "Molodechno");
    }
}
