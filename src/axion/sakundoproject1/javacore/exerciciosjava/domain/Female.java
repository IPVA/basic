package axion.sakundoproject1.javacore.exerciciosjava.domain;

public class Female extends Humans{

    public Female(String name, float height, char gender) {
        super(name, height, gender);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        System.out.println(this.height);
        System.out.println(this.gender);
    }

}
