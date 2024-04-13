package tributary.cli;

import java.util.List;

public class CreateExecutor implements TributaryExecutor {

    @Override
    public String execute(Command command) {
        List<String> args = command.getArgs();
        String name = args.get(0);

        switch (name) {
            case "create":
                return "create topic <id> <type>";
            case "partition":
                return "create partition <topic> <id>";
            case "consumer":
                if (args.get(1).equals("group")) {
                return "create consumer group <id> <topic> <rebalancing>";
                } else {
                return "create consumer group <id>";
                }
            case "producer":
                return "create producer <id> <type> <allocation>";
            default:
                return "Create: Invalid arguments. Valid create commands:\n\n"
                        + "create topic <id> <type>\n"
                        + "create partition <topic> <id>\n"
                        + "create consumer group <id> <topic> <rebalancing>\n"
                        + "create consumer group <id>\n"
                        + "create producer <id> <type> <allocation>\n";
        }
    }
}
