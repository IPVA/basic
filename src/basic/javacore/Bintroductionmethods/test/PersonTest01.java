package basic.javacore.Bintroductionmethods.test;
import basic.javacore.Bintroductionmethods.domain.Person;
public class PersonTest01 {
    public static void main(String[] args){
        Person person = new Person();
        person.setName("Mario");
        person.setAge(12);
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}
