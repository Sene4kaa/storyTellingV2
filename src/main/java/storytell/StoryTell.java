package main.java.storytell;

import main.java.explanations.Condition;
import main.java.people.Human;


public class StoryTell implements Action{

    private StoryTell() {
    }

    public static void act(Human human, Condition condition, String phrase, int delay) throws InterruptedException {

        Action.performAction(human, condition, phrase, delay);
    }
}
