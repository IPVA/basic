package basic.javacore.exerciciosjava.domain;

public class Male extends Humans{

    public Male(String name, float height, char gender) {
        super(name, height, gender);

    }

    public void print() {
        System.out.println(this.name);
        System.out.println(this.height);
        System.out.println(this.gender);
    }

}
