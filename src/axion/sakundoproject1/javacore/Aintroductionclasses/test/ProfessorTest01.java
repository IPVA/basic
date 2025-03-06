package axion.sakundoproject1.javacore.Aintroductionclasses.test;

import axion.sakundoproject1.javacore.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Dilan";
        professor.age = 43;
        professor.gender = 'M';
        System.out.print(professor.gender);
    }
}
