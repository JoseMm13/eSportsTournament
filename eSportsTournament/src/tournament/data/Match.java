package tournament.data;

public class Match {
    Tournament tournament;
    Participant participant1;
    Participant participant2;
    String result;

    /**
     * Getters
     * @return
     */
    public Tournament getTournament() {
        return tournament;
    }
    public Participant getParticipant1() {
        return participant1;
    }
    public Participant getParticipant2() {
        return participant2;
    }
    public String getResult() {
        return result;
    }
    /**
     * Setters
     * @param tournament
     */
    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }
    public void setParticipant1(Participant participant1) {
        this.participant1 = participant1;
    }
    public void setParticipant2(Participant participant2) {
        this.participant2 = participant2;
    }
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * Constructor
     * @param tournament
     * @param participant1
     * @param participant2
     * @param result
     */
    public Match(Tournament tournament, Participant participant1, Participant participant2, String result) {
        this.tournament = tournament;
        this.participant1 = participant1;
        this.participant2 = participant2;
        this.result = "Pending.";
    }

    /**
     * Method toString
     * @return
     */
    @Override
    public String toString() {
        return "Match:" + "\n" +
                "Tournament: " + tournament + ". \n" +
                " Participant1: " + participant1 + ". \n" +
                " Participant2:" + participant2 + ". \n" +
                ", result='" + result +".";
    }

}
