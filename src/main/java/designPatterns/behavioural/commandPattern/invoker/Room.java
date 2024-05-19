package designPatterns.behavioural.commandPattern.invoker;

import designPatterns.behavioural.commandPattern.command.Command;
import designPatterns.behavioural.commandPattern.component.Light;

import java.util.List;

public abstract class Room {

    private List<Command> commandList;
    private Light light;

    public List<Command> getCommandList() {
        return commandList;
    }

    public void setCommandList(List<Command> commandList) {
        this.commandList = commandList;
    }

    public void executeCommand() {
        for (Command command : commandList) {
            command.executeCommand();
        }
    }


}
