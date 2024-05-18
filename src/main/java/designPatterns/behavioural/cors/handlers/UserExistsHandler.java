package designPatterns.behavioural.cors.handlers;

import designPatterns.behavioural.cors.DateBase;

public class UserExistsHandler extends Handler {

    private final DateBase dateBase;

    public UserExistsHandler(DateBase dateBase) {
        this.dateBase = dateBase;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!dateBase.isValidUser(username)) {
            System.out.println("user is not valid = " + username);
            return false;
        }
        System.out.println("username = " + username + "is valid");
        return handleNext(username, password);
    }
}
