package Java2_Klausurvorbereitung.WKQ1223;

import java.util.ArrayList;

public record Planet(String name, Integer radius, Double mass, Integer moons, Type type) {
    public static ArrayList<Planet> getPlanets(){
        ArrayList<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Erde", 10, 10.0, 1, Type.TERRESTRIAL_PLANET));
        return planets;
    }
}
