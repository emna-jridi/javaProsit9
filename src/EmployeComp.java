import java.util.Comparator;

public class EmployeComp implements Comparator<Employe> {



    @Override
    public int compare(Employe o1, Employe o2) {
            int res = o1.getDepartement().compareTo(o2.getDepartement());
            if (res == 0) {
                res = Integer.compare(o1.getGrade(), o2.getGrade());
            }
            return res;
        }}
