package designPatterns.behavioural.commandPattern.command;

import designPatterns.behavioural.commandPattern.component.Light;

public class LightsSwitchCommand implements Command {

    private Light light;

    public LightsSwitchCommand(Light light) {
        this.light = light;
    }

    @Override
    public void executeCommand() {
        System.out.print("Switching the lights");
        System.out.println("light current state = " + light.switchLights());
    }
}
