package designPatterns.behavioural.commandPattern.invoker;

import designPatterns.behavioural.commandPattern.component.Curtain;
import designPatterns.behavioural.commandPattern.component.Light;

public class LivingRoom extends Room {

    private Light light;
    private Curtain curtain;

    public Light getLight() {
        return light;
    }

    public Curtain getCurtain() {
        return curtain;
    }

    public LivingRoom() {
        this.light = new Light();
        this.curtain = new Curtain();
    }

    @Override
    public void executeCommand() {
        System.out.println("Executing commands of living room");
        super.executeCommand();
    }
}
