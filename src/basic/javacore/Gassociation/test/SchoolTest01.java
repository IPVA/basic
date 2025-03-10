package basic.javacore.Gassociation.test;
import basic.javacore.Gassociation.domain.Professor;
import basic.javacore.Gassociation.domain.School;

public class SchoolTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Sakundo");
        Professor professor2 = new Professor("Shaiko");
        Professor professor3 = new Professor("Hitsuri Mei");
        Professor professor4 = new Professor("Agaroth");
        School school = new School("Axion School");

        school.setProfessors(new Professor[]{professor1, professor2, professor3, professor4});

        school.print();


    }
}
