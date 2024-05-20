package designPatterns.behavioural.corsPattern;

import designPatterns.behavioural.corsPattern.handlers.RoleExistsHandler;
import designPatterns.behavioural.corsPattern.handlers.UserExistsHandler;
import designPatterns.behavioural.corsPattern.handlers.ValidPasswordHandler;

public class MainApp {
public static void main(String[] args) {
    DateBase dateBase = new DateBase();
    UserExistsHandler userExistsHandler = new UserExistsHandler(dateBase);

    AuthService authService = new AuthService(userExistsHandler);
    userExistsHandler.setNext(new ValidPasswordHandler(dateBase)).setNext(new RoleExistsHandler());

    System.out.println("________________________________________________________________");

    authService.authenticate("Grace Chandra", "3e3792aa-c4df-4d73-8946-58dc69ec970e");
    System.out.println("________________________________________________________________");
    authService.authenticate("admin", "123");

    System.out.println("________________________________________________________________");
    authService.authenticate("user1", "236");


    System.out.println("________________________________________________________________");
    authService.authenticate("admin", "456");
}

}
