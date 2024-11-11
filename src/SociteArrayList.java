import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SociteArrayList implements IGestion {

    List<Employe> employeList = new ArrayList<>();
    @Override
    public void ajouterEmploye(Object o) {
employeList.add((Employe) o);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        if (employeList.isEmpty()) {
            return false;
        }
        else return employeList.get(0).getNom().equals(nom);
    }

    @Override
    public boolean rechercherEmploye(Object o) {
        if (employeList.isEmpty()) {
            return false;
        }
        else return employeList.get(0).equals(o);

    }

    @Override
    public void supprimerEmploye(Object o) {
        employeList.remove(o);

    }

    @Override
    public void displayEmploye() {
       for (Employe employe: employeList) {
           System.out.println(employe.toString());
       }

    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employeList);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
Collections.sort(employeList,
        new EmployeComp());
    }
}
