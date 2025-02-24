package tournament.data;

public class IndividualTournament extends Tournament{
    /**
     * Constructor
     * @param name
     * @param associatedGame
     * @param price
     */
    public IndividualTournament(String name, String associatedGame, double price) {
        super(name, associatedGame, price);
    }

    /**
     * Method toString
     * @return
     */
    @Override
    public String toString() {
        return "IndividualTournament{" +
                "name='" + name + '\'' +
                ", associatedGame='" + associatedGame + '\'' +
                ", price=" + price +
                '}';
    }
}
