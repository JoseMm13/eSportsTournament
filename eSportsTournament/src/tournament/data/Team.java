package tournament.data;

public class Team extends Participant{
    Player [] player;
    int playerCount;

    /**
     * Getters Array Player and playerCount
     * @return
     */
    public Player[] getPlayer() {
        return player;
    }
    public int getPlayerCount() {
        return playerCount;
    }
    public void setPlayer(Player[] player) {
        this.player = player;
    }
    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }

    /**
     * Constructor with parameters
     * @param name
     * @param player
     * @param playerCount
     */
    public Team(String name, Player[] player, int playerCount) {
        super(name);
        this.player = player;
        this.playerCount = playerCount;
    }

}
