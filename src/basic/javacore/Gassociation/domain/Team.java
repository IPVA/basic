package basic.javacore.Gassociation.domain;

public class Team {
    public String name;
    private Player[] players;

    public Team(String name) {
        this.name = name;

    }


    public void print(){
        System.out.println("--------------------------------");
        System.out.printf("%s: ", this.name);
        for(Player player: players){
            System.out.printf("%s ", player.getName());
        }

    }


    public String getName() {
        return name;
    }


    public void setPlayers(Player[] players){
        this.players = players;
    }


}
