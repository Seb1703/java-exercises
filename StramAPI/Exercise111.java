package StramAPI;

import java.util.List;

import StramAPI.Heroes;
import StramAPI.Heroes.Hero;
import StramAPI.Heroes.Hero.Sex;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.Optional;

public class Exercise111 {
    public static void main(String[] args){
        List<Hero> heroes = Heroes.ALL;

        //Aufgabe 1.1
        //1.1
        heroes.stream().forEach(hero -> System.out.printf("%s,%s,%s%n", hero.name(), hero.sex(), hero.yearFirstAppearance() ));

        //1.2
        System.out.println(heroes.stream().allMatch(hero -> hero.yearFirstAppearance() >1900));

        //1.3
        System.out.println(heroes.stream().anyMatch(hero -> hero.sex() == Sex.FEMALE && hero.yearFirstAppearance() > 1950));

        //1.4
        System.out.println(heroes.stream().min((hero1, hero2) -> Integer.compare(hero1.yearFirstAppearance(), hero2.yearFirstAppearance())));

        //1.5
        System.out.println(heroes.stream().min((hero1, hero2) -> Integer.compare(Math.abs(hero1.yearFirstAppearance() - 1960), Math.abs(hero2.yearFirstAppearance() - 1960))));

        //1.6
        /* StringBuilder collectedYears = heroes.stream().collect(StringBuilder::new, (sb, hero) 
            -> sb.append(sb.isEmpty() ? "": ", ")
                .append(hero.yearFirstAppearance()),
                (sb1, sb2) -> sb1.append( sb2.isEmpty() ? "" : "," + sb2 ));
        System.out.println(collectedYears); */

        System.out.println(heroes.stream().collect(StringBuilder::new, 
                (sb, hero) -> sb.append(sb.isEmpty() ? "": ", ")
                                .append(hero.yearFirstAppearance()),
                (sb1, sb2) -> sb1.append( sb2.isEmpty() ? "" : "," + sb2 )));

        //1.7
        System.out.println(heroes.stream()
            .collect(Collectors.groupingBy(hero -> hero.sex())));

        //1.8
        System.out.println(heroes.stream()
            .collect(Collectors.partitioningBy(hero -> hero.yearFirstAppearance() < 1970)));

        //2.1
        System.out.println(heroes.stream().filter(hero -> hero.sex() == Sex.FEMALE).count());

        //2.2
        heroes.stream()
            .sorted((hero1, hero2) -> Integer.compare(hero1.yearFirstAppearance(), hero2.yearFirstAppearance()))
            .forEach(System.out::println); 
        
        //2.3
            //a)
        String allFemaleNames = heroes.stream().filter(hero -> hero.sex() == Sex.FEMALE)
            .map(hero -> hero.name())
            .collect(Collectors.joining(", "));
        System.out.println(allFemaleNames);
            //b)
        List<Hero> heroesAnonymous = heroes.stream()
            .map(hero -> new Hero(hero.name().replaceAll( "\\s*\\(.*\\)$", "" ), hero.sex(), hero.yearFirstAppearance()))
            .collect(Collectors.toList());
        System.out.println(heroesAnonymous);

            //c
        int[] yearsFirstAppearance = heroes.stream()
            .mapToInt(hero -> hero.yearFirstAppearance()).distinct().toArray();
        System.out.println(Arrays.toString(yearsFirstAppearance));

        //2.4
        Heroes.UNIVERSES.stream()
            .flatMap(Heroes.Universe::heroes)
            .map(hero -> hero.name())
            .forEach(System.out::println);

        }
}
