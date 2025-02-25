package tournament.Exceptions;

public class FullTeamException extends Exception{

    public FullTeamException(String message) {
        super(message);
    }

    public FullTeamException()
    {
        super("Ha llegado al límite de jugadores en el equipo.");
    }
}
