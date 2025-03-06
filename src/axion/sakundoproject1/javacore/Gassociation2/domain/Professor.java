package axion.sakundoproject1.javacore.Gassociation2.domain;

public class Professor {
    private String name;
    private String researchField;
    private Seminar[] seminars;

    public Professor(String name, String researchField) {
        this.name = name;
        this.researchField = researchField;
    }

    public Professor(String name, String researchField, Seminar[] seminars){
        this(name, researchField);
        this.seminars = seminars;
    }

    public void print(){
        System.out.println("----------------------------------");
        System.out.println("Name: " + this.name);
        System.out.println("Research Field: " + this.researchField);
        System.out.print("Participating in seminars: ");
        for(Seminar seminar: seminars){
            System.out.printf("%s| ", seminar.getTitle());
        }
        System.out.println("\n----------------------------------");
    }


    public void setSeminars(Seminar[] seminars) {
        this.seminars = seminars;
    }


}
