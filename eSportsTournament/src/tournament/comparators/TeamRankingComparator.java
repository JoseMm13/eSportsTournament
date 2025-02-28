package tournament.comparators;

import tournament.data.Team;
import tournament.data.TournamentManager;

import java.util.Comparator;

public class TeamRankingComparator implements Comparator<Team> {

    private final TournamentManager manager;

    /**
     *
     * @param manager
     */
    public TeamRankingComparator(TournamentManager manager) {
        this.manager = manager;
    }

    /**
     *
     * @param t1 the first object to be compared.
     * @param t2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(Team t1, Team t2) {
        double avgRanking1 = manager.calculateTeamAverageRanking(t1);
        double avgRanking2 = manager.calculateTeamAverageRanking(t2);
        return Double.compare(avgRanking2, avgRanking1); // Orden descendente por ranking promedio
    }

}
