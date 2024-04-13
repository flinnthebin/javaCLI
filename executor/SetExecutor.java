package tributary.cli;

import java.util.List;

public class SetExecutor implements TributaryExecutor {

    @Override
    public String execute(Command command) {
        List<String> args = command.getArgs();
        String name = args.get(0);

        switch (name) {
            case "consumer":
                return "set consumer group rebalancing <group> <rebalancing>";
            default:
                return "Set: Invalid arguments. Valid set commmands:\n\n"
                        + "set consumer group rebalancing <group> <rebalancing>\n";
        }
    }
}
