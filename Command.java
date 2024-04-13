package tributary.cli;

import java.util.List;

public class Command {
    private String name; // create, delete, produce, consume, show, parallel, set, playback
    private List<String> args;

    public Command(String name, List<String> args) {
        this.name = name;
        this.args = args;
    }

    public String getName() {
        return name;
    }

    public List<String> getArgs()  {
        return args;
    }
}
