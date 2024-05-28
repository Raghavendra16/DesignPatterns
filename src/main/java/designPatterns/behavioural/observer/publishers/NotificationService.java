package designPatterns.behavioural.observer.publishers;

import designPatterns.behavioural.observer.Event;
import designPatterns.behavioural.observer.listeners.EventListener;

import java.util.*;

public class NotificationService {

    private Map<Event, List<EventListener>> eventToListenerMap;

    public NotificationService() {
        this.eventToListenerMap = new HashMap<>();
        Arrays.stream(Event.values()).forEach(event -> eventToListenerMap.put(event, new ArrayList<>()));
    }

    public void subscribe(Event event, EventListener eventListener) {
        eventToListenerMap.get(event).add(eventListener);
    }

    public void unsubscribe(Event event, EventListener eventListener) {
      eventToListenerMap.get(event).remove(eventListener);
    }

    public void notify(Event eventType) {
        eventToListenerMap.get(eventType).stream().forEach(eventListener -> eventListener.update(eventType));
    }


}
