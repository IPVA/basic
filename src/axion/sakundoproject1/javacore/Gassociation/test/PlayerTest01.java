package axion.sakundoproject1.javacore.Gassociation.test;

import axion.sakundoproject1.javacore.Gassociation.domain.Player;

public class PlayerTest01 {
    public static void main(String[] args) {
        Player p1 = new Player("Sakundo");
        Player p2 = new Player("Agaroth");
        Player p3 = new Player("Hitsuri Mei");

        Player[] players = {p1,p2,p3};

        for(Player player : players){
            player.print();
        }
    }
}
