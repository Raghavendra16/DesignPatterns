package designPatterns.behavioural.commandPattern.invoker;

import designPatterns.behavioural.commandPattern.component.Light;

public class KitchenRoom extends Room {

    private Light light;

    public KitchenRoom() {
        this.light = new Light();
    }

    public Light getLight() {
        return light;
    }

    @Override
    public void executeCommand() {
        System.out.println("executing commands of kitchen room");
        super.executeCommand();
    }
}
