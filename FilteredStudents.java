import java.util.ArrayList;
import java.util.function.Predicate;

public class FilteredStudents {
    private final ArrayList<Student> students;
    private final Predicate<Student> mandatoryFilter;

    public FilteredStudents(Predicate<Student> mandatoryFilter){
        this.students = new ArrayList<>();
        this.mandatoryFilter = mandatoryFilter;
    }

    public ArrayList<Student> students(){
        return students;
    }

    public Predicate<Student> mandatoryFilter(){
        return mandatoryFilter;
    }

    public void add(Student student){
        if(mandatoryFilter.test(student)){
            students.add(student);
        }
    }

    public void printStudents(){
        students.forEach(student -> System.out.println(student));
    }
}
