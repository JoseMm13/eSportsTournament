package tournament.data;

public abstract class Participant {
    protected String name;

    /**
     * Adding getter
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Adding setter
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

}
