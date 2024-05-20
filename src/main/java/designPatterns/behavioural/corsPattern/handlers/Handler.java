package designPatterns.behavioural.corsPattern.handlers;

public abstract class Handler {

    private Handler next;

    public abstract boolean handle(String username, String password);

    public Handler setNext(Handler handler) {
        this.next = handler;
        return next;
    }

    protected boolean handleNext(String username, String password) {
        if (next == null) {
            return true;
        }
        return next.handle(username, password);
    }

}
