package Java2_Klausurvorbereitung.Probeklausur.Stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public record Uni(List<Professor> professors, List<Student> students) {
    public List<Double> q1(){
        return students.stream()
            .map(s -> s.grades().values().stream()
                .mapToDouble(g -> g)
                .average().orElse(0))
            .toList();
    }

    public void q2(){
        professors.stream()
            .filter(p -> p.courses().stream().anyMatch(c -> c.equals("Math")))
            .sorted((p1, p2) -> Integer.compare(p2.age(), p1.age()))
            .limit(3)
            .forEach(p -> System.out.println("blabla " + p.name()));
    }

    public Map<Integer, List<Professor>> q3(){
        return professors.stream()
            .filter(p -> p.courses().size() <= 2)
            .collect(Collectors.groupingBy(p -> p.age()));
    }

    public List<List<Student>> q4(String professorName){
        return professors.stream()
            .filter(p -> p.name().equals(professorName))
            .map(p -> students.stream()
                .filter(s -> s.grades().keySet().stream()
                    .anyMatch(sc -> p.courses().stream()
                        .anyMatch(pc -> sc.equals(pc))))
                .toList())
            .toList();
    }

    public List<String> q5(){
        return students.stream()
            .filter(s -> s.grades().values().stream()
                .anyMatch(g -> g >= 1.5))
            .map(s -> s.name().toLowerCase())
            .distinct()
            .toList();
    }

    //Kurs in dem Schüler jeweils am besten ist
    public List<String> q6(){
        return students().stream()
            .map(s -> s.grades().keySet().stream()
                .sorted((g1, g2) -> Double.compare(s.grades().get(g1), s.grades().get(g2)))
                .findFirst().orElse("keine Note"))
            .toList();  
    }

    //Gib für einen bestimmten Schüler die Fächer in absteigender Reihenfolge des Alters der Dozenten an
    public List<String> q7(String studentName){
        return students.stream()
            .filter(s -> s.name().equalsIgnoreCase(studentName))
            .map(s -> s.grades().keySet().stream()
                .sorted((c1,c2) -> Integer.compare(
                    professors.stream()
                        .filter(p -> p.courses().stream()
                            .anyMatch(pc -> pc.equals(c2)))
                        .map(p -> p.age())
                        .findFirst().orElse(0)
                        , professors.stream()
                        .filter(p -> p.courses().stream()
                            .anyMatch(pc -> pc.equals(c1)))
                        .map(p -> p.age())
                        .findFirst().orElse(0)
                    ))
                .toList())
            .findFirst().orElse(List.of());
    }




























    /* public List<Double> q1(){
        return students().stream()
            .map(s -> s.grades().values().stream()
                .mapToDouble(g -> g)
                .average().orElse(0))
            .toList();
    }

    public void q2(){
        professors.stream()
            .filter(p -> p.courses().stream()
                .anyMatch(c -> c.equalsIgnoreCase("math")))
            .sorted((p1, p2) -> Integer.compare(p2.age(), p1.age()))
            .limit(3)
            .forEach(p -> System.out.println("6138 Minuten Bazinga Spaß an dich " + p.name()));
    }

    public Map<Integer, List<Professor>> q3(){
        return professors.stream()
            .filter(p -> p.courses().size() <= 2)
            .collect(Collectors.groupingBy(p -> p.age()));
    }

    public List<List<Student>> q4(String professorName){
        return professors.stream()
            .filter(p -> p.name().equals(professorName))
            .map(p -> students.stream()
                .filter(s -> s.grades().keySet().stream()
                        .anyMatch(sc -> p.courses().stream()
                            .anyMatch(pc -> sc.equals(pc))))
                .toList())
            .toList();
    }

    public List<List<Student>> q42(String professorName) {
        return professors.stream()
                .filter(professor -> professor.name().equals(professorName))
                .map(professor -> students.stream()
                        .filter(student -> student.grades().keySet().stream()
                                .anyMatch(studentCourses -> professor.courses().stream()
                                        .anyMatch(professorCourses -> studentCourses.equals(professorCourses))))
                        .toList())
                .toList();
    }

    public List<String> q5(){
        return students.stream()
            .filter(s -> s.grades().values().stream()
                .anyMatch(g -> g >= 1.5))
            .map(s -> s.name())
            .distinct().toList();
    }

    //Gebe Liste an Namen Professoren je Schüler, in denen sie besser als 2.0 waren. ohne dopplungen
    public List<List<String>> q6(){
        return students.stream()
            .map(s -> professors().stream()
                .filter(p -> p.courses().stream()
                    .anyMatch(pc -> s.grades().keySet().stream()
                        .anyMatch(sc -> sc.equals(pc)) && s.grades().get(pc) < 2.0))
                .map(p -> p.name()).distinct()
                .toList())
            .toList();
    }

    //Berechne Durchschnittsnote nach Modul
    public Map<String, Double> q7(){
        return professors.stream()
            .map(p -> p.courses())
            .flatMap(pc -> pc.stream())
            .collect(Collectors.toMap(
                c -> c,
                c -> students.stream()
                    .filter(s -> s.grades().containsKey(c))
                    .mapToDouble(s -> s.grades().get(c))
                    .average().orElse(0)));
    } */
}
