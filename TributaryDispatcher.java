package tributary.cli;

import tributary.cli.executor.*;

public class TributaryDispatcher {
    public String dispatch(Command command) {
        TributaryExecutor executor = getExecutor(command.getName());

        if (executor != null) {
            return executor.execute(command);
        } else {
            return "Unknown command: " + command.getName();
        }
    }

    private TributaryExecutor getExecutor(String name) {
        switch (name) {
            case "create":
                return new CreateExecutor();
            case "delete":
                return new DeleteExecutor();
            case "produce":
                return new ProduceExecutor();
            case "consume":
                return new ConsumeExecutor();
            case "show":
                return new ShowExecutor();
            case "parallel":
                return new ParallelExecutor();
            case "set":
                return new SetExecutor();
            case "playback":
                return new PlaybackExecutor();
            default:
                return null;
        }
    }
}
