package tributary.cli.executor;

import tributary.cli.Command;
import tributary.cli.TributaryExecutor;

import java.util.List;

public class ConsumeExecutor implements TributaryExecutor {

    @Override
    public String execute(Command command) {
        List<String> args = command.getArgs();
        String name = args.get(0);

        switch (name) {
            case "event":
                return "consume event <consumer> <partition>";
            case "events":
                return "consume events <consumer> <partition> <number of events>";
            default:
                return "Consume: Invalid arguments. Valid consume commands:\n\n"
                        + "consume event <consumer> <partition>\n"
                        + "consume events <consumer> <partition> <number of events>\n";
        }
    }
}

