package basic.javacore.Hinheritance.test;


import basic.javacore.Hinheritance.domain.Anime;
import basic.javacore.Hinheritance.domain.Naruto;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("");
        Naruto naruto = new Naruto("Naruto");

        naruto.print();

    }
}
