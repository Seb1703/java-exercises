package Java2_Klausurvorbereitung.WKQ123;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class DataQueries {
    private static  ArrayList<Data> data = Data.getData();

    public static List<Data> a(){
        return data.stream()
            .filter(data -> data.shapeType().equals(ShapeType.RECTANGLE))
            .sorted((d1, d2) -> Integer.compare(d2.percentage(), d1.percentage()))
            .toList();
    }

    public static int b(){
        return data.stream()
            .filter(d -> d.temperature() > 20.0)
            .mapToInt(d -> {
                switch(d.shapeType()){
                    case ShapeType.TRIANGLE: 
                        return 3;
                    case ShapeType.RECTANGLE: 
                        return 4;
                    default:
                        return 0;
                }
            })
            .sum();
    }

    public static void c(){
        data.stream()
            .filter(d -> d.percentage() > 50)
            .filter(d -> d.date().getMonthValue() < 3 || d.date().getMonthValue() > 11)
            .map(d -> "[" + d.country() + "][" + String.valueOf(d.date().getYear() + "]:[" + String.valueOf(d.percentage() + "]%")))
            .forEach(System.out::println);
    }

    public static Data d(){
        Optional<Data> value = data.stream()
            .filter(d -> (d.temperature() * d.percentage() /100 )> 10)
            .findAny();

        return value.isPresent() ? value.get() : null;
    }

    public static boolean e(){
        return data.stream()
            .filter(d -> d.date().equals(LocalDate.now()))
            .anyMatch(d -> d.country() == "China");
    }
}
