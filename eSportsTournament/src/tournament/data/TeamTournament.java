package tournament.data;

public class TeamTournament extends Tournament{
    String playersPerTeam;

    public TeamTournament(String name, String associatedGame, double price, String playersPerTeam) {
        super(name, associatedGame, price);
        this.playersPerTeam = playersPerTeam;
    }

    @Override
    public String toString() {
        return "MixedTournament{" +
                "playersPerTeam='" + playersPerTeam + '\'' +
                ", name='" + name + '\'' +
                ", associatedGame='" + associatedGame + '\'' +
                ", price=" + price +
                '}';
    }
}
