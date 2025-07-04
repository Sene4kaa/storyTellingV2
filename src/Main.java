import people.*;
import explanations.*;
import storyTell.*;


public class Main{

    public static void main(String[] args) {

        Narrator narrator = new Narrator("Senya", 2003);

        Author author = new Author("Oxxxymiron_", "Miron", 35);

        Mate mate1 = new Mate("Slava", "KPSS", 30);
        Mate mate2 = new Mate("Sonya", "Marmeladova", 32);
        Mate mate3 = new Mate("Gnoyniy", "", 29);

        Robber robber = new Robber("Yuriy", "Hovanskiy", 47);

        try {
            System.out.println(narrator.startStory());

            StoryTell.performAction(author, Condition.SAYING, null, 1000);
            StoryTell.performAction(
                    author,
                    null,
                    "Слушайте, сударь, я попытаюсь выручить вас, но прежде я вам ставлю два условия...",
                    1000
            );
            StoryTell.performAction(author, Condition.KEEPING_SILENT, null, 1000);
            StoryTell.performAction(author, Condition.IMPATIENT, null, 1000);

            StoryTell.performAction(mate1, Condition.SAYING, null, 1000);
            StoryTell.performAction(
                    mate1,
                    null,
                    String.format("Я весь в вашей власти, распоряжайтесь мною по своему усмотрению, - " +
                            "и мной и моим %s, если нам удастся отнять его у %s; если же нет, то даю вам слово, что, " +
                            "пока жив, я буду вашим послушным рабом, пойду всюду, куда бы вы меня ни послали, и, если понадобится," +
                            "умру за вас", mate1.getItems(), robber.getName() + robber.getSurname()),
                    1000
            );
            StoryTell.performAction(mate1, Condition.KEEPING_SILENT, null, 1000);

            StoryTell.performAction(mate2, Condition.AGREE, null, 1000);
            StoryTell.performAction(mate3, Condition.AGREE, null, 1000);

            StoryTell.performAction(author, Condition.SAYING, null, 1000);
            StoryTell.performAction(
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
            StoryTell.performAction(author, Condition.KEEPING_SILENT, null, 1000);

            author.getItems();
            robber.getItems();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}