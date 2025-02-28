package tournament.data;
import java.util.Random;

public class TournamentManager
{
    Random r = new Random();
    int numrandom = r.nextInt(11);

    Player [] registredPlayers = new Player[10];
    Team [] registeredTeams = new Team[5];
    Tournament [] tournaments = new Tournament[3];
    Match [] matches = new Match[numrandom];

    /**
     * Populates the arrays with predefined data
     * initializes players, teams, tournaments, and matches
     */
    public void initialize()
    {
        /**
         * initializes registredPlayers
         */
        registredPlayers[0] = new Player("Player1", 10, 1500.5f);
        registredPlayers[1] = new Player("Player2", 15, 1200.0f);
        registredPlayers[2] = new Player("Player3", 8, 2000.3f);
        registredPlayers[3] = new Player("Player4", 12, 1850.7f);
        registredPlayers[4] = new Player("Player5", 20, 1700.1f);
        registredPlayers[5] = new Player("Player6", 11, 1600.9f);
        registredPlayers[6] = new Player("Player7", 13, 1400.4f);
        registredPlayers[7] = new Player("Player8", 9, 1550.2f);
        registredPlayers[8] = new Player("Player9", 7, 1900.6f);
        registredPlayers[9] = new Player("Player10", 18, 1750.8f);

        /**
         * initializes registeredTeams
         */
        registeredTeams[0] = new Team("Team1", new Player[5], 0);
        registeredTeams[1] = new Team("Team2", new Player[5], 0);
        registeredTeams[2] = new Team("Team3", new Player[5], 0);
        registeredTeams[3] = new Team("Team4", new Player[5], 0);
        registeredTeams[4] = new Team("Team5", new Player[5], 0);

        /**
         * initializes Tournaments
         */
        tournaments[0] = new IndividualTournament("SoloTournament", "Chess", 50.0);
        tournaments[1] = new TeamTournament("TeamTournament", "Football", 100.0, "11 players");
        tournaments[2] = new MixedTournament("MixedTournament", "E-Sports", 75.0, "Multiplayer");

        /**
         * initializes matches with a random number between 1 & 10
         */
        for(int i=0;i< matches.length;i++)
        {
            matches[i] = new Match("RandomTournament", registredPlayers[i % registredPlayers.length],
                    registredPlayers[(i + 1) % registredPlayers.length], "Pending");
        }
    }
    /**
     * Searches for a player by username.
     *
     * @param username The username of the player to search for.
     * @return The Player object if found, otherwise null.
     */
    public Player findPlayer(String username)
    {
        for (Player player : registredPlayers)
        {
            if (player.getName().equalsIgnoreCase(username))
            {
                return player;
            }
        }
        return null;
    }

    /**
     * Searches for a team by the name.
     * @param teamName
     * @return The Team object if found, otherwise null.
     */
    public Team findTeam(String teamName) {
        for (Team team : registeredTeams) {
            if (team.getName().equalsIgnoreCase(teamName)) {
                return team;
            }
        }
        return null;
    }

    /**
     * Displays all available tournaments.
     */
    public void showTournaments() {
        for (Tournament tournament : tournaments) {
            System.out.println(tournament);
        }
    }

    /**
     * Displays all players sorted by their ranking in descending order.
     */
    /*public void showPlayerRanking() {
        Arrays.sort(registredPlayers, Comparator.comparingDouble(Player::getRanking).reversed());
        for (Player player : registredPlayers) {
            System.out.println(player);
        }
    }*/

    /**
     * Displays all teams sorted by their average player ranking in descending order.
     */
    /*public void showTeamRanking() {
        Arrays.sort(registeredTeams, Comparator.comparingDouble(this::calculateTeamAverageRanking).reversed());
        for (Team team : registeredTeams) {
            System.out.println(team);
        }
    }*/

    /**
     * method used to calculate the team average ranking
     * @param team The team whose average ranking is calculated.
     * @return The average ranking of the team.
     */
    public double calculateTeamAverageRanking(Team team) {
        double totalRanking = 0;
        int count = 0;
        for (Player player : team.getPlayer()) {
            if (player != null) {
                totalRanking += player.getRanking();
                count++;
            }
        }
        return count > 0 ? totalRanking / count : 0;
    }
}
