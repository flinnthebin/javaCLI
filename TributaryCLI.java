package tributary.cli;

public class TributaryCLI {
    public static void main(String[] args) {
         TributaryParser tribParse = new TributaryParser();
         TributaryDispatcher tribDispatch = new TributaryDispatcher();
         TributaryInputHandler tribInput = new TributaryInputHandler();

         while (true) {
            String input = tribInput.getInput();
            Command command = tribParse.parse(input);
            String output = tribDispatch.dispatch(command);
            System.out.println(output);
        }
    }
}
