package basic.javacore.Aintroductionclasses.test;

import basic.javacore.Aintroductionclasses.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Dilan";
        professor.age = 43;
        professor.gender = 'M';
        System.out.print(professor.gender);
    }
}
