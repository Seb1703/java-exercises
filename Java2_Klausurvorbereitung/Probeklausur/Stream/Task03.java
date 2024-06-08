package Java2_Klausurvorbereitung.Probeklausur.Stream;

import java.util.List;
import java.util.Map;

public class Task03 {
    public static void main(String[] args) {
        // Beispiel-Daten erstellen
        List<Professor> professors = List.of(
                new Professor("Dr. Müller", 50, List.of("Math", "Physics")),
                new Professor("Dr. Schmidt", 60, List.of("Sports")),
                new Professor("Dr. Meier", 45, List.of("Chemistry")),
                new Professor("Dr. Lehmann", 40, List.of("Biology", "Data Science")),
                new Professor("Dr. Schulz", 55, List.of("Computer Science"))
        );

        List<Student> students = List.of(
                new Student("Alice", 22, Map.of("Math", 1.0, "Physics", 1.3)),
                new Student("Bob", 20, Map.of("Math", 2.0, "Chemistry", 1.7)),
                new Student("Charlie", 23, Map.of("Biology", 3.0, "Computer Science", 1.4)),
                new Student("David", 21, Map.of("Math", 1.2, "Physics", 2.3)),
                new Student("Eva", 24, Map.of("Computer Science", 1.6, "Math", 1.0))
        );

        Uni university = new Uni(professors, students);

        // q1: Durchschnittsnoten
        System.out.println("Durchschnittsnoten: " + university.q1());

        // q2: Gruß für die ältesten Mathe-Professoren
        university.q2();

        // q3: Professoren mit zwei oder weniger Vorlesungen nach Alter gruppieren
        System.out.println("Professoren nach Alter gruppiert: " + university.q3());

        // q4: Studenten in den Vorlesungen eines bestimmten Professors
        System.out.println("Studenten in den Vorlesungen von Dr. Schmidt: " + university.q4("Dr. Schmidt"));

        // q5: Studenten mit einer Note von 1,5 oder schlechter
        System.out.println("Studenten mit Note 1,5 oder schlechter: " + university.q5());

        System.out.println(university.q6());

        System.out.println(university.q7());
    }
}
