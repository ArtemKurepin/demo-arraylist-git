package by.itacademy.artemkurepin;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Moscow");
        cities.add("Gua");
        cities.add("New York");
        cities.add("Brest");
        cities.add("Ghomel");
        System.out.println(cities);

        cities.set(2, "Molodechno");
        System.out.println(cities);
        CitiesUtil.printCitiesLenght(cities);
        System.out.println("Город с максимальной длинной "+CitiesUtil.cityWithMaxLenght(cities));
        System.out.println("Город с минимальной длинной "+CitiesUtil.cityWithMinLenght(cities));

    }
}
