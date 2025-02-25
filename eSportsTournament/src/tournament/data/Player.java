package tournament.data;

public class Player extends Participant{
    int level;
    float ranking;

    /**
     * Getters of Level and ranking
     * @return
     */
    public int getLevel(){
        return level;
    }
    public float getRanking(){
        return ranking;
    }
    /**
     * Setters of Level and ranking
     * @return
     */
    public void setLevel(int level){
        this.level = level;
    }
    public void setRanking(float ranking){
        this.ranking = ranking;
    }

    /**
     * Constructor
     * @param name
     * @param level
     * @param ranking
     */
    public Player(String name, int level, float ranking) {
        super(name);
        this.level = level;
        this.ranking = ranking;
    }

    /**
     * Method toString
     * @return
     */
    @Override
    public String toString() {
        return "Player: " + " Name: " + name + " Level: " + level + " Ranking=" + ranking;
    }
}
