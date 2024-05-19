package designPatterns.behavioural.templatePattern.template;

public class PizzaDeliveryTemplate extends FoodDeliveryTemplate{
    @Override
    protected void deliverPackage() {
        System.out.println("Delivering pizza in 30 minutes");
    }

    @Override
    protected void prepareFood() {
        System.out.println("Preparing pizza in five minutes");
    }
}
