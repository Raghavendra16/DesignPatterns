package designPatterns.behavioural.cors.handlers;

public class RoleExistsHandler extends Handler{
    @Override
    public boolean handle(String username, String password) {
        if(username.equals("admin")) {
            System.out.println("loading admin pages");
        }
        System.out.println("loading user pages");
        return handleNext(username, password);
    }
}
