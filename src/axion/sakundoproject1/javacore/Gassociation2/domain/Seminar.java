package axion.sakundoproject1.javacore.Gassociation2.domain;

public class Seminar {
    private String title;
    private Student[] students;
    private String place;

    public Seminar(String place, String title) {
        this.place = place;
        this.title = title;
    }


    public void print(){

        System.out.println("----------------------------------");
        System.out.println(this.title);
        System.out.printf("Address: %s\n", this.place);
        System.out.print("Students Participating: ");
        if(this.students == null){
            System.out.println("Without Students");
            return;
        }
        for(Student student: students){
            System.out.printf("%s| ", student.getName());
        }
        System.out.println("\n----------------------------------");
    }


    public void setStudents(Student[] students){
        this.students = students;
    }



    public String getTitle() {
        return title;
    }
}
