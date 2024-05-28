package designPatterns.behavioural.observer;

import designPatterns.behavioural.observer.publishers.NotificationService;

public class Store {

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    private NotificationService notificationService;

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void notify(Event  event) {
        notificationService.notify(event);
    }
}
