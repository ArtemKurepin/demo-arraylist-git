package by.itacademy.artemkurepin;

import java.util.ArrayList;

public class CitiesUtil {

    static public String cityWithMaxLengh(ArrayList<String> cities) {
        int maxCityLenght = cities.get(0).length();
        String maxLengthCity=null;
        for (String city : cities) {
            if (city.length() > maxCityLenght) {
                maxCityLenght = city.length();
                maxLengthCity=city;
            }
        }
        return maxLengthCity+" length: "+maxCityLenght;
    }
    static public void printCitiesLenght(ArrayList<String> cities){
        for(String city: cities){
            System.out.println(city+" length: "+city.length());
        }
    }
}
