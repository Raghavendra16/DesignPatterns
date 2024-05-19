package designPatterns.behavioural.templatePattern.template.client;

import designPatterns.behavioural.templatePattern.template.BiryaniDeliveryTemplate;
import designPatterns.behavioural.templatePattern.template.FoodDeliveryTemplate;
import designPatterns.behavioural.templatePattern.template.PizzaDeliveryTemplate;

public class MainApp {

    public static void main(String[] args) {
        FoodDeliveryTemplate pizzaDelivery = new PizzaDeliveryTemplate();
        FoodDeliveryTemplate biryaniDelivery = new BiryaniDeliveryTemplate();

        System.out.println("------------------------");
        pizzaDelivery.deliverFood();
        System.out.println("------------------------");
        biryaniDelivery.deliverFood();
    }
}
