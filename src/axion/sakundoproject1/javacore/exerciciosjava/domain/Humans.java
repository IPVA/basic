package axion.sakundoproject1.javacore.exerciciosjava.domain;

import java.util.*;

public class Humans {
    protected String name;
    protected float height;
    protected char gender;
    protected Humans[] humans;


    public Humans(String name, float height, char gender) {
        this.name = name;
        this.height = height;
        this.gender = gender;
    }


    public void setHumans(Humans[] humans) {
        this.humans = humans;
    }


    public float getHeight() {
        return this.height;
    }


    public char getGender() {
        return this.gender;
    }



    public void print() {

        ArrayList<Float> heightOfHumans = new ArrayList<>();
        ArrayList<Character> genderOfHumans = new ArrayList<>();

        for(Humans human: humans) {
            if(human.getGender() == 'M') {
                heightOfHumans.add(human.getHeight());
            }

            genderOfHumans.add(human.getGender());
        }

        float add = 0;
        float max = 0;
        for(float number : heightOfHumans) {
            if(number > max) {
                max = number;
            }
            add += number;
        }

        float average = add / heightOfHumans.toArray().length;

        System.out.print("Max: ");
        System.out.println(max);


        System.out.print("Average: ");
        System.out.print(average);



    }

}
