package designPatterns.behavioural.commandPattern.component;

public class Light implements Component {

    private boolean switchLight;

    public Light() {
        this.switchLight = false;
    }

    public boolean switchLights() {
        switchLight = !switchLight;
        return switchLight;
    }
}
