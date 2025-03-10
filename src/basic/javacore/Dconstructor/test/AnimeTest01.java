package basic.javacore.Dconstructor.test;
import basic.javacore.Dconstructor.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Chuunibyou", "Action", 12, "Finished");
        Anime anime2 = new Anime("Chuu", "Act", 12, "Fin", "JUMP");

        anime.print();
        System.out.println("-----------------------------");
        anime2.print();

    }
}
