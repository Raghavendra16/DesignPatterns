package designPatterns.behavioural.commandPattern.component;

public class Curtain implements Component {
    private  boolean isCurtainClosed;

    public Curtain() {
        this.isCurtainClosed = false;
    }

    public boolean moveCurtains() {
        isCurtainClosed = !isCurtainClosed;
        return isCurtainClosed;
    }
}
