/* Participants  José Ángel García Martínez, Yassin Ezzahouani Loune  1ºDAW
   21/02/2025
   Practice Java eSportsTournament.
 */
package tournament.main;
import tournament.Exceptions.FullTeamException;
import tournament.comparators.TeamRankingComparator;
import tournament.data.MixedTournament;
import tournament.data.Tournament;
import tournament.data.Player;
import tournament.data.Team;
import tournament.data.TournamentManager;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /**
     * Show menu
     */
    public static void showMenu(){
        System.out.println("\nTournament Manager Menu:");
        System.out.println("1. View available tournaments ordered by name");
        System.out.println("2. View players information ordered by ranking and name");
        System.out.println("3. View teams information ordered by ranking");
        System.out.println("4. Add a new player to a team");
        System.out.println("5. Find an exact player by name");
        System.out.println("6. Find a player");
        System.out.println("7. Find a team");
        System.out.println("8. Show all the matches ordered by tournament name");
        System.out.println("9. Update the result of the matches pending");
        System.out.println("10. Exit");
        System.out.print("Enter your choice: ");
    }

    /**
     *
     * @param manager
     */
    public static void viewTournamentsOrderedByName(TournamentManager manager) {
        manager.showTournamentsOrderedByName();
    }

    /**
     *
     * @param manager
     */
    public static void viewPlayersOrderedByRankingAndName(TournamentManager manager) {
        manager.showPlayerRanking();
    }

    /**
     *
     * @param manager
     */
    public static void viewTeamsOrderedByRanking(TournamentManager manager) {
        Arrays.sort(manager.registeredTeams, new TeamRankingComparator(manager));

        System.out.println("\nTeams ordered by ranking:");
        for (Team team : manager.registeredTeams) {
            System.out.println(team);
        }
    }

    /**
     *
     * @param sc
     * @param manager
     */
    public static void addNewPlayerToTeam(Scanner sc, TournamentManager manager) {
        System.out.print("Enter the team name: ");
        String teamName = sc.nextLine();
        Team team = manager.findTeam(teamName);
        if (team == null) {
            System.out.println("Team not found!");
            return;
        }

        System.out.print("Enter the player name: ");
        String playerName = sc.nextLine();
        Player player = manager.findPlayer(playerName);
        if (player == null) {
            System.out.println("Player not found!");
            return;
        }

        try {
            team.addPlayer(player);
            System.out.println("Player added to the team successfully!");
        } catch (FullTeamException e) {
            System.out.println("Error: Team is already full.");
        }
    }

    /**
     *
     * @param sc
     * @param manager
     */
    public static void findExactPlayerByName(Scanner sc, TournamentManager manager) {
        System.out.print("Enter the exact player name: ");
        String playerName = sc.nextLine();
        Player player = manager.findPlayer(playerName);
        if (player != null) {
            System.out.println("Player found: " + player);
        } else {
            System.out.println("Player not found.");
        }
    }

    /**
     *
     * @param sc
     * @param manager
     */
    public static void findPlayer(Scanner sc, TournamentManager manager) {
        System.out.print("Enter part of the player name: ");
        String partialName = sc.nextLine();
        boolean found = false;
        for (Player player : manager.registredPlayers) {
            if (player.getName().toLowerCase().contains(partialName.toLowerCase())) {
                System.out.println(player);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No players found with that name.");
        }
    }

    /**
     *
     * @param sc
     * @param manager
     */
    public static void findTeam(Scanner sc, TournamentManager manager) {
        System.out.print("Enter the team name: ");
        String teamName = sc.nextLine();
        Team team = manager.findTeam(teamName);
        if (team != null) {
            System.out.println("Team found: " + team);
        } else {
            System.out.println("Team not found.");
        }
    }

    /**
     *
     * @param manager
     */
    public static void showMatchesOrderedByTournamentName(TournamentManager manager) {
        manager.showMatchesOrderedByTournamentName();
    }

    /**
     *
     * @param sc
     * @param manager
     */
    public static void updateMatchResults(Scanner sc, TournamentManager manager) {
        manager.inputResult(sc);
    }

    public static void main(String[] args) throws FullTeamException {
        Scanner sc = new Scanner(System.in);

        TournamentManager manager = new TournamentManager();
        manager.initialize(); //--> HERE IS FOR INICIALIZE WITH PREDEFINED DATA

        String option;
        Boolean exit = false;

        while(!exit){
            showMenu();
            option = sc.nextLine();
            switch (option){
                case "1":
                    viewTournamentsOrderedByName(manager);
                    break;
                case "2":
                    viewPlayersOrderedByRankingAndName(manager);
                    break;
                case "3":
                    viewTeamsOrderedByRanking(manager);
                    break;
                case "4":
                    addNewPlayerToTeam(sc,manager);
                    break;
                case "5":
                    findExactPlayerByName(sc,manager);
                    break;
                case "6":
                    findPlayer(sc,manager);
                    break;
                case "7":
                    findTeam(sc,manager);
                    break;
                case "8":
                    showMatchesOrderedByTournamentName(manager);
                    break;
                case "9":
                    updateMatchResults(sc,manager);
                    break;
                case "10":
                    System.out.println("Exiting the program. BYE!!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
        sc.close();
    }
}