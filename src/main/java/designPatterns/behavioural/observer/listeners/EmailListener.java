package designPatterns.behavioural.observer.listeners;

import designPatterns.behavioural.observer.Event;

public class EmailListener implements EventListener {

    @Override
    public void update(Event eventType) {
        System.out.printf("Sending out emails for the event: %s", eventType.name());
        System.out.println("");
    }
}
