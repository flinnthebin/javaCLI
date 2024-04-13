package tributary.cli;

import java.util.List;

public class ShowExecutor implements TributaryExecutor {

    @Override
    public String execute(Command command) {
        List<String> args = command.getArgs();
        String name = args.get(0);

        switch (name) {
            case "topic":
                return "show topic <topic>";
            case "consumer":
                return "show consumer group <group>";
            default:
                return "Show: Invalid arguments. Valid show commands:\n\n"
                        + "show topic <topic>\n"
                        + "show consumer group <group>\n";
        }
    }
}
