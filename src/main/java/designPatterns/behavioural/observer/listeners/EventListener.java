package designPatterns.behavioural.observer.listeners;

import designPatterns.behavioural.observer.Event;

public interface EventListener {

    void update(Event event);
}
