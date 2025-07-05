package main.java.storytell;

import main.java.explanations.Condition;
import main.java.people.Human;

public interface Action {

    static void performAction(Human h, Condition c, String phrase, int delay) throws InterruptedException {

        if (c != null) { h.setCondition(c); }
        else if (phrase != null) {
            h.sayPhrase(phrase);
        }
        Thread.sleep(delay);
    }
}


