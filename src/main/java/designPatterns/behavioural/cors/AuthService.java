package designPatterns.behavioural.cors;

import designPatterns.behavioural.cors.handlers.Handler;

public class AuthService {

    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public void authenticate(String username, String password) {
        if(handler.handle(username, password)) {
            System.out.println("user is authenticated :" + username);
            return;
        }
        System.out.println("user is not authenticated");
    }
}
