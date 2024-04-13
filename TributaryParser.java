package tributary.cli;

import java.util.Arrays;
import java.util.List;

public class TributaryParser {
    public Command parse(String input) {
        String[] chunks = input.split(" ");
        String name = chunks[0];
        List<String> args = Arrays.asList(Arrays.copyOfRange(chunks, 1, chunks.length));

        return new Command(name, args);
    }
}
