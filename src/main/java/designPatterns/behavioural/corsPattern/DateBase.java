package designPatterns.behavioural.corsPattern;

import java.util.HashMap;
import java.util.Map;

public class DateBase {

    private final Map<String, String> userToPasswordMap;

    public DateBase() {
        this.userToPasswordMap = new HashMap<>();
        userToPasswordMap.put("admin", "123");
        userToPasswordMap.put("user1", "236");
    }

    public boolean isValidUser(String username) {
        return userToPasswordMap.containsKey(username);
    }

    public boolean isValidPassword(String username, String password) {
        if (userToPasswordMap.containsKey(username)) {
            return userToPasswordMap.get(username).equals(password);
        }
        return false;
    }
}