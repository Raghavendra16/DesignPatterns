package designPatterns.behavioural.observer.listeners;

import designPatterns.behavioural.observer.Event;

public class MobileListener implements EventListener {

    @Override
    public void update(Event eventType) {
        System.out.printf("Sending out sms for the event: %s", eventType.name());
        System.out.println("");

    }
}
