package duke.command;

import duke.DataHandler;
import duke.TaskManager;

public class ExitCommand extends Command{

    public ExitCommand() {
        hasExecutedExitCommand();
    }

    @Override
    public void executeCommand(TaskManager taskManager, DataHandler dataHandler) {
    }
}
