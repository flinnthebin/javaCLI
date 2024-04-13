package tributary.cli;

import java.util.List;

public class DeleteExecutor implements TributaryExecutor {

    public String execute(Command command) {
        List<String> args = command.getArgs();
        String name = args.get(0);

        switch (name) {
            case "consumer":
                return "delete consumer <consumer>";
            default:
                return "Delete: Invalid arguments. Valid delete commands:\n\n"
                        + "delete consumer <consumer>\n";
        }
    }
}
