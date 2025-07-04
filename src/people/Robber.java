package people;

import explanations.Condition;
import explanations.Items;

import java.util.Random;

public class Robber extends Human{

    public Robber(String name, String surname, int age) {

        super(name, surname, age);
        validate();
    }

    public void setCondition(Condition c) {

        this.condition = c;

        switch (this.condition) {
            case Condition.SAYING: {
                System.out.printf("%s %s заорал:%n", this.getName(), this.getSurname());
                break;
            }
            case Condition.KEEPING_SILENT: {
                System.out.printf("%s %s стих.%n", this.getName(), this.getSurname());
                break;
            }
            case Condition.WONDERING: {
                System.out.printf("%s %s упал.%n", this.getName(), this.getSurname());
                break;
            }
            case Condition.IMPATIENT: {
                System.out.printf("%s %s ударил собеседника.%n", this.getName(), this.getSurname());
                break;
            }
            case Condition.AGREE: {
                System.out.printf("%s %s угостил тортиком.%n", this.getName(), this.getSurname());
                break;
            }
        }
    }
}
