package basic.javacore.Gassociation.domain;

public class School {
    private String name;
    private Professor[] professors;

    public School(String name) {
        this.name = name;

    }

    public void print() {
        System.out.println(this.name);
        System.out.println("--------------------------------");
        if (this.professors == null) return;
        for (Professor professor : professors) {
            System.out.printf("%s, ", professor.getName());
        }

    }


    public void setProfessors(Professor[] professors) {
        this.professors = professors;
    }

}
