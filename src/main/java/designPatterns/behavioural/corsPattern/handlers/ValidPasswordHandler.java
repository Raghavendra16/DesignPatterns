package designPatterns.behavioural.corsPattern.handlers;

import designPatterns.behavioural.corsPattern.DateBase;

public class ValidPasswordHandler extends Handler {

    private final DateBase database;

    public ValidPasswordHandler(DateBase database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if (!database.isValidPassword(username, password)) {
            System.out.println("username = " + username + "has an incorrect password");
            return false;
        }

        System.out.println("password is valid");
        return handleNext(username, password);
    }
}
