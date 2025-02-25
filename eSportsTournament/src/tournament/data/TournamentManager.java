package tournament.data;

import java.util.Random;

public class TournamentManager {
    Random r = new Random();
    int numrandom = r.nextInt(11);

    Player [] registredPlayers = new Player[10];
    Team [] registeredTeams = new Team[5];
    Tournament [] tournaments = new Tournament[3];
    Match [] matches = new Match[numrandom];


}
