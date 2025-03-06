package axion.sakundoproject1.javacore.Gassociation2.test;
import axion.sakundoproject1.javacore.Gassociation2.domain.Professor;
import axion.sakundoproject1.javacore.Gassociation2.domain.Place;
import axion.sakundoproject1.javacore.Gassociation2.domain.Seminar;
import axion.sakundoproject1.javacore.Gassociation2.domain.Student;


public class SeminarTest01 {
    public static void main(String[] args) {
        Place place1 = new Place("Axion AI Programming Campus");
        Place place2 = new Place("Axion Philosophy Campus");
        Place place3 = new Place("Axion Ninjutsu Campus");
        Place place4 = new Place("Axion Genjutsu Campus");
        Place place5 = new Place("Axion Programming Campus");
        Place place6 = new Place("Axion Math Campus");
        Place place7 = new Place("Axion Plaza");

        Seminar seminar1 = new Seminar(place1.getAddress(), "AI Programming Seminar");
        Seminar seminar2 = new Seminar(place2.getAddress(), "Philosophy Seminar");
        Seminar seminar3 = new Seminar(place3.getAddress(), "Ninjutsu Seminar");
        Seminar seminar4 = new Seminar(place4.getAddress(), "Taijutsu Seminar");
        Seminar seminar5 = new Seminar(place5.getAddress(), "Programming Seminar");
        Seminar seminar6 = new Seminar(place6.getAddress(), "Math Seminar");
        Seminar seminar7 = new Seminar(place7.getAddress(), "Life Seminar");


        Professor professor1 = new Professor("Xavier","Philosophy");
        Professor professor2 = new Professor("Kakashi","Ninjutsu");
        Professor professor3 = new Professor("Gai-Sensei","Taijutsu");
        Professor professor4 = new Professor("DevDojo","Programming");


        Student student1 = new Student("Sakundo", 24);
        Student student2 = new Student("Shadow", 20);
        Student student3 = new Student("Agaroth", 22);
        Student student4 = new Student("Shaiko", 19);
        Student student5 = new Student("Hitsuri Mei", 18);
        Student student6 = new Student("Naruto", 15);
        Student student7 = new Student("Sasuke", 16);
        Student student8 = new Student("Sakura", 15);
        Student student9 = new Student("Gaara", 17);
        Student student10 = new Student("Rock Lee", 14);
        Student student11 = new Student("Neji", 16);

        seminar1.setStudents(new Student[]{student1, student4,});
        seminar2.setStudents(new Student[]{student11});
        seminar3.setStudents(new Student[]{student6, student7, student9});
        seminar4.setStudents(new Student[]{student10, student11, student8});
        seminar5.setStudents(new Student[]{student2});
        seminar6.setStudents(new Student[]{student3});
        seminar7.setStudents(new Student[]{student5});



        professor1.setSeminars(new Seminar[]{seminar2, seminar7});
        professor2.setSeminars(new Seminar[]{seminar3});
        professor3.setSeminars(new Seminar[]{seminar4});
        professor4.setSeminars(new Seminar[]{seminar1, seminar5, seminar6});

        professor1.print();

        seminar1.print();
        seminar7.print();


    }
}
