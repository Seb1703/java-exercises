package Java2_Klausurvorbereitung.Probeklausur.Stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public record Uni(List<Professor> professors, List<Student> students) {
    public List<Double> q1(){
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
}
