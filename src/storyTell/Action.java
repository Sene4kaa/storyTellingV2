package storyTell;

import explanations.Condition;
import people.Human;

public interface Action {

    public static void performAction(Human h, Condition c, String phrase, int delay) throws InterruptedException {

        if (c != null) { h.setCondition(c); }
        else if (phrase != null) {
            h.sayPhrase(phrase);
        }
        Thread.sleep(delay);
    }
}


