package axion.sakundoproject1.javacore.Hinheritance.domain;

public class Anime {
    protected String name;
    protected String genre;
    protected int year;

    public Anime(String name) {
        this.name = name;
    }

    public void print() {
        System.out.print(this.getName());
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }


    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}
