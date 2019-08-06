package sk.me.patterns.behavioral.mediator;

import java.util.Date;

public class Chat {

    public static void showMessage(User user, String message) {
        System.out.println(String.format("%s [%s]: %s", new Date().toString(), user.getName(),message));
    }

}
