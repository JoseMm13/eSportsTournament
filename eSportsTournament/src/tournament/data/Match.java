package tournament.data;

public class Match {
    String tournament;
    Participant participant1;
    Participant participant2;
    String result;

    /**
     * Getters
     * @return
     */
    public String getTournament() {
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
    public void setTournament(String tournament) {
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
    public Match(String tournament, Participant participant1, Participant participant2, String result) {
        this.tournament = tournament;
        this.participant1 = participant1;
        this.participant2 = participant2;
        this.result = "Pending.";
    }

    @Override
    public String toString() {
        return "Match{" +
                "tournament='" + tournament + '\'' +
                ", participant1=" + participant1 +
                ", participant2=" + participant2 +
                ", result='" + result + '\'' +
                '}';
    }
}
