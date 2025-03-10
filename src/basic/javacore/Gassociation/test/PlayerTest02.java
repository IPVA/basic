package basic.javacore.Gassociation.test;
import basic.javacore.Gassociation.domain.Player;
import basic.javacore.Gassociation.domain.Team;

public class PlayerTest02 {
    public static void main(String[] args) {
        Player p1 = new Player("Shaiko");
        Player p2 = new Player("Sakundo");
        Player p3 = new Player("Agaroth");
        Player p4 = new Player("Ace");
        Player p5 = new Player("Hitsuri Mei");
        Team team2 = new Team("Axion Team");

        team2.setPlayers(new Player[]{p1,p2,p3,p4,p5});

        p1.setTeam(team2);
        p2.setTeam(team2);
        p3.setTeam(team2);
        p4.setTeam(team2);
        p4.setTeam(team2);


        Player player = new Player("Enzo");
        Team team = new Team("Izuma Eleven");


        player.setTeam(team);
        player.print();
        team2.print();
        System.out.println("----------------------");
        p1.print();

    }
}
