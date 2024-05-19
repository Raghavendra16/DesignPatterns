package designPatterns.behavioural.commandPattern.command;

import designPatterns.behavioural.commandPattern.component.Curtain;

public class CurtainCloseCommand implements Command {

    private Curtain curtain;

    public CurtainCloseCommand(Curtain curtain) {
        this.curtain = curtain;
    }

    @Override
    public void executeCommand() {
        System.out.print("Moving the curtains ");
        System.out.println("curtain is currently closed = " + curtain.moveCurtains());
    }
}
