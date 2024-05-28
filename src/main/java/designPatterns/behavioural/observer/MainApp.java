package designPatterns.behavioural.observer;

import designPatterns.behavioural.observer.listeners.EmailListener;
import designPatterns.behavioural.observer.listeners.EventListener;
import designPatterns.behavioural.observer.listeners.MobileListener;
import designPatterns.behavioural.observer.publishers.NotificationService;

public class MainApp {

    public static void main(String[] args) {
        Store store = new Store();
        NotificationService notificationService = new NotificationService();

        EventListener emailEventListner = new EmailListener();
        MobileListener mobileEventListner = new MobileListener();

        notificationService.subscribe(Event.PROMO, emailEventListner);
        notificationService.subscribe(Event.SALE, emailEventListner);
        notificationService.subscribe(Event.PROMO, mobileEventListner);
        notificationService.subscribe(Event.SALE, mobileEventListner);


        store.setNotificationService(notificationService);
        store.notify(Event.PROMO);
        store.notify(Event.SALE);

        System.out.println("Unsubscribing mobiles from sale");

        store.getNotificationService().unsubscribe(Event.SALE, mobileEventListner);
        store.notify(Event.SALE);
        store.notify(Event.PROMO);

    }
}
