import java.util.*;

public class SociteArrayList implements IGestion<Employe>{

 private  List<Employe> employeList ;
public SociteArrayList(){
    this.employeList = new ArrayList<>();
}

    @Override
    public void ajouterEmploye(Employe o) {
employeList.add(o);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
      for(int i =0 ;i<this.employeList.size();i++){
          if(this.employeList.get(i).getNom().equals(nom)){
              return true;
          }
      }
      return false;
    }

    @Override
    public boolean rechercherEmploye(Employe o) {
       return this.employeList.contains(o);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        employeList.remove(employe);
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
Collections.sort(employeList ,
        new ComparatorParDep()
                .thenComparing(new ComparatorParGrade()));
    }
}
