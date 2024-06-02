package Java2_Klausurvorbereitung.WKQ123;

import java.time.LocalDate;
import java.util.ArrayList;

public record Data(String country, LocalDate date, double temperature, int percentage, ShapeType shapeType) {
    public static ArrayList<Data> getData(){
        ArrayList<Data> data =  new ArrayList<>();
        data.add(new Data("De",LocalDate.of(2023,2,17),17.3, 54,ShapeType.CIRCLE));
        data.add(new Data("Fr",LocalDate.of(2023,3,17),19.3, 18,ShapeType.RECTANGLE));
        data.add(new Data("Fr",LocalDate.of(2023,3,17),29.3, 17,ShapeType.RECTANGLE));
        data.add(new Data("China",LocalDate.of(2024,6,2),29.3, 51,ShapeType.TRIANGLE));
        return data;
    }
}
