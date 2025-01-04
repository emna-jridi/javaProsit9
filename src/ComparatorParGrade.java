import java.util.Comparator;

public class ComparatorParGrade implements Comparator<Employe> {
    public int compare(Employe emp1, Employe emp2) {
        return emp1.getGrade() - emp2.getGrade();
    }
}
