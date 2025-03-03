public class Employe  implements Comparable<Employe>{

    private int id ;
    private String nom;
    private String prenom;
    private String departement ;
    private int grade;

    public Employe() {};
    public Employe(int id, String nom, String prenom, String departement, int grade) {
            this.id = id;
            this.nom = nom;
            this.prenom = prenom;
            this.departement = departement;
            this.grade = grade;
    }
        public int getId() {
        return id;
        }
        public void setId(int id) {
        this.id = id;
        }
        public String getNom() {
        return nom;
        }
        public void setNom(String nom) {
        this.nom = nom;

        }

        public String getPrenom() {
        return prenom;
        }
        public void setPrenom(String prenom) {
        this.prenom = prenom;
        }
        public String getDepartement() {
        return departement;
        }
        public void setDepartement(String departement) {
        this.departement = departement;
        }
        public int getGrade() {
        return grade;
        }
        public void setGrade(int grade) {
        this.grade = grade;
        }

        @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        if(o instanceof Employe employe )
            return ((Employe) o).id == employe.id && ((Employe) o).nom.equals(employe.nom);
            return false;
        }
        @Override
    public  String toString() {
        return "employe: {"+ getId()+" " +getNom()+" "  +getPrenom() +" " +getDepartement() +" " +getGrade() +'}';
        }

    @Override
    public int compareTo(Employe o) {
        return this.getId() - o.getId();
    }
}

