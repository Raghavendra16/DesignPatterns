package designPatterns.behavioural.templatePattern.template;

public class BiryaniDeliveryTemplate extends FoodDeliveryTemplate{
    @Override
    protected void deliverPackage() {
        System.out.println("Delivering package in an hour");
    }

    @Override
    protected void prepareFood() {
        System.out.println("Preparing biryani with special ingredients");
    }
}
