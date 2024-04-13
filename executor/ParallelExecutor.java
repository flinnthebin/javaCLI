package tributary.cli;

import java.util.List;

public class ParallelExecutor implements TributaryExecutor {

    @Override
    public String execute(Command command) {
        List<String> args = command.getArgs();
        String name = args.get(0);

        switch (name) {
            case "produce":
                return "parallel produce (<producer>, <topic>, <event>)";
            case "consume":
                return "parallel consume (<consumer, <partition>)";
            default:
                return "Parallel: Invalid arguments. Valid parallel commands:\n\n"
                        + "parallel produce (<producer>, <topic>, <event>)\n"
                        + "parallel consume (<consumer, <partition>)\n";
        }
    }
}

