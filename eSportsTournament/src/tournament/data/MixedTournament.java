package tournament.data;

public class MixedTournament extends Tournament{
    String gameMode;

    /**
     * Constructor whit new parameter and inheritance
     * @param name
     * @param associatedGame
     * @param price
     * @param gameMode
     */
    public MixedTournament(String name, String associatedGame, double price, String gameMode) {
        super(name, associatedGame, price);
        this.gameMode = gameMode;
    }

    /**
     * Method toString
     * @return
     */
    @Override
    public String toString() {
        return "MixedTournament - " + "GameMode: " + gameMode + "- Name: " + name +
                " - Associated Game: " + associatedGame + " - Price: " + price+"€";
    }
}
