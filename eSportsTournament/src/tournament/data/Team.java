package tournament.data;

import tournament.Exceptions.FullTeamException;

import java.lang.reflect.Method;

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

    /**
     *
     * @param player
     * @throws FullTeamException
     */
    public void addPlayer(Player player) throws FullTeamException {
        if (playerCount < this.player.length)
        {
            this.player[playerCount++] = player;
        }
        else
        {
            throw new FullTeamException("The team is already full.");
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Team: " + getName() + " - Members: " + playerCount + "/5:\n");
        for(int i=0;i<playerCount;i++){
            sb.append("- ").append(player[i].toString()).append("\n");
        }
        return sb.toString();
    }
}
