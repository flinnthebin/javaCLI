package tributary.cli;

import java.util.List;

public class ProduceExecutor implements TributaryExecutor {

    @Override
    public String execute(Command command) {
        List<String> args = command.getArgs();
        String name = args.get(0);

        switch (name) {
            case "event":
                return "produce event <producer> <topic> <event> <partition>";
            default:
                return "Produce: Invalid arguments. Valid produce commands:\n\n"
                        + "produce event <producer> <topic> <event> <partition>\n";
        }
    }
}

