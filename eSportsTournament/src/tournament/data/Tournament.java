package tournament.data;

public abstract class Tournament {
    /**
     * Atributtes of Class Tournament
     */
    protected String name;
    protected String associatedGame;
    protected double price;

    /**
     * Adding Getters
     * @return
     */
    public String getName(){
        return name;
    }
    public String getAssociatedGame(){
        return associatedGame;
    }
    public double getPrice(){
        return price;
    }

    /**
     * Adding Setters
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }
    public void setAssociatedGame(String associatedGame) {
        this.associatedGame = associatedGame;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Constructor with parameters
     * @param name
     * @param associatedGame
     * @param price
     */

    public Tournament(String name, String associatedGame, double price) {
        this.name = name;
        this.associatedGame = associatedGame;
        this.price = price;
    }

    /**
     * Method toString
     * @return
     */
    @Override
    public String toString() {
        return "Tournament: " +"\n" +
                "Name: " + name  + " - Associated Game: '" + associatedGame + " - Price Inscription= " +
                price + '€'+ "\n";
    }
}
