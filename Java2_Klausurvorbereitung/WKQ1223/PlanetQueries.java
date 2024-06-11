package Java2_Klausurvorbereitung.WKQ1223;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class PlanetQueries {
    private ArrayList<Planet> planets = Planet.getPlanets();

    public void q1(){
        planets.stream()
            .filter(p -> p.mass() < 100)
            .map(p -> p.name() + ": " + p.mass() + "kg")
            .forEach(System.out::println);
    }

    public void q2(){
        Double moons = planets.stream()
            .mapToDouble(p2 -> p2.moons())
            .average().orElse(0);
        System.out.println("Durchschnittliche Anzahl Monde: " + moons);
    }

    public List<Planet> q3(){
        return planets.stream()
            .filter(p -> p.moons() >=1)
            .sorted((p1, p2) -> Double.compare(p2.radius(), p1.radius()))
            .toList();
    }

    public boolean q4(){
        return planets.stream()
            .anyMatch(p -> p.name().equals("Erde"));
    }

    public void q5(){
        Map<Integer, List<Planet>> planetMoons =  planets.stream()
            .collect(Collectors.groupingBy(p -> p.moons()));

        planetMoons.keySet().stream()
            .map(m -> m + ": " + planetMoons.get(m).toString())
            .forEach(System.out::println);
    }
}
