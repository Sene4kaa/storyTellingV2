package main.java.main;

import main.java.explanations.Condition;
import main.java.people.Author;
import main.java.people.Mate;
import main.java.people.Robber;
import main.java.storytell.Narrator;
import main.java.storytell.StoryTell;


public class Main{

    public static void main(String[] args) {

        Narrator narrator = new Narrator("Senya", 2003);

        Author author = new Author("Oxxxy", "Miron");

        Mate mate1 = new Mate("Slava", "KPSS");
        Mate mate2 = new Mate("Sonya", "Marmeladova");
        Mate mate3 = new Mate("Gnoyniy", "");

        Robber robber = new Robber("Yuriy", "Hovanskiy");

        System.out.println(narrator.startStory());

        try {

            StoryTell.act(author, Condition.SAYING, null, 1000);
            StoryTell.act(
                    author,
                    null,
                    "Слушайте, сударь, я попытаюсь выручить вас, но прежде я вам ставлю два условия...",
                    1000
            );
            StoryTell.act(author, Condition.KEEPING_SILENT, null, 1000);
            StoryTell.act(author, Condition.IMPATIENT, null, 1000);

            StoryTell.act(mate1, Condition.SAYING, null, 1000);
            StoryTell.act(
                    mate1,
                    null,
                    String.format("Я весь в вашей власти, распоряжайтесь мною по своему усмотрению, - " +
                            "и мной и моим %s, если нам удастся отнять его у %s; если же нет, то даю вам слово, что, " +
                            "пока жив, я буду вашим послушным рабом, пойду всюду, куда бы вы меня ни послали, и, если понадобится," +
                            "умру за вас", mate1.getItems(), robber.getName() + robber.getSurname()),
                    1000
            );
            StoryTell.act(mate1, Condition.KEEPING_SILENT, null, 1000);

            StoryTell.act(mate2, Condition.AGREE, null, 1000);
            StoryTell.act(mate3, Condition.AGREE, null, 1000);

            StoryTell.act(author, Condition.SAYING, null, 1000);
            StoryTell.act(
                    author,
                    null,
                    String.format(
                            "Если так, господа, то вот мои условия: во первых, пока вы у меня на острове, " +
                                    "вы не будете предъявлять никаких притязаний на власть; и, если я дам вам %s, " +
                                    "вы по первому моему требованию возвратите мне его, не станете злоумышлять ни против меня, " +
                                    "ни против моих подданных на этом острове и будете подчиняться всем моим распоряжением. " +
                                    "Во вторых, если нам удастся овладеть вашим %s, " +
                                    "вы бесплатно доставите на нем в Англию меня и моего слугу.",
                            author.getItems(),
                            mate1.getItems()),
                    1000
            );
            StoryTell.act(author, Condition.KEEPING_SILENT, null, 1000);

            author.getItems();
            robber.getItems();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}