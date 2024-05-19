package designPatterns.behavioural.templatePattern.template;

public abstract class FoodDeliveryTemplate {

    public final void deliverFood() {
        receiveOrder();
        locateResturant();
        prepareFood();
        deliverPackage();
    }

    protected abstract void deliverPackage();

    protected abstract void prepareFood();

    private void locateResturant() {
        System.out.println("locating resturant");
    }

    private void receiveOrder() {
        System.out.println("Receivied order");
    }


}
