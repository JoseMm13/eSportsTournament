package tournament.comparators;
import tournament.data.Tournament;
import java.util.Comparator;

public class TournamentNameComparator implements Comparator<Tournament> {
    /**
     *
     * @param t1 the first object to be compared.
     * @param t2 the second object to be compared.
     * @return
     */
    public int compare(Tournament t1, Tournament t2) {
        return t1.getName().compareTo(t2.getName());
    }
}
