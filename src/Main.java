public class Main {
    public static void main(String[] args) {
Employe e1 = new Employe(3 ,"emna", "jridi", "it" , 10);
        Employe e2 = new Employe(2 ,"emna", "jridi", "it1" , 10);
System.out.println(e1.toString());


SociteArrayList soc = new SociteArrayList();
soc.ajouterEmploye(e1);
soc.ajouterEmploye(e2);
soc.displayEmploye();
soc.trierEmployeParId();
        System.out.println("////");
soc.trierEmployeParNomDépartementEtGrade();
        soc.displayEmploye();
    }
}