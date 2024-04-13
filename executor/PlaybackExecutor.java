package tributary.cli;

public class PlaybackExecutor implements TributaryExecutor {

    @Override
    public String execute(Command command) {
        return "some logic for handling <consumer> <partition> <offset>";
    }
}
