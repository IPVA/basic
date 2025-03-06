package axion.sakundoproject1.javacore.Einitializationblock.domain;

public class Anime {
    private String name;
    public int[] episodes;
    {
        episodes = new int[100];
        for(int i = 0; i < episodes.length; i++) {
            episodes[i] = i+ 1;
        }
    }

    public Anime() {

        for (int episode : episodes) {
            System.out.print(episode + " ");
        }
    }
}
