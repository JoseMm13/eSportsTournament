package tournament.comparators;

import tournament.data.Player;

import java.util.Comparator;

public class PlayerRankingComparator implements Comparator<Player> {
    /**
     * Comparator by ranking and if thuey tie, oreder by name.
     * @param p1 the first object to be compared.
     * @param p2 the second object to be compared.
     * @return
     */
    public int compare(Player p1, Player p2) {
        int rankingComparison = Double.compare(p2.getRanking(), p1.getRanking());
        if (rankingComparison == 0) {
            return p1.getName().compareToIgnoreCase(p2.getName()); //--> HERE, IF THEY TIE, ALPHABETICAL ORDER BY NAME.
        }
        return rankingComparison;
    }
}
