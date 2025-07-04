package people;

import exceptions.NameException;
import explanations.Condition;

public class Mate extends Human{

    public Mate(String name, String surname, int age) {

        super(name, surname, age);
        validate();
    }

    public void setCondition(Condition c) {

        this.condition = c;

        switch (this.condition) {
            case Condition.SAYING: {
                System.out.printf("%s %s промычал:%n", this.getName(), this.getSurname());
                break;
            }
            case Condition.KEEPING_SILENT: {
                System.out.printf("%s %s умолк.%n", this.getName(), this.getSurname());
                break;
            }
            case Condition.WONDERING: {
                System.out.printf("%s %s огошнулся.%n", this.getName(), this.getSurname());
                break;
            }
            case Condition.IMPATIENT: {
                System.out.printf("%s %s забычил.%n", this.getName(), this.getSurname());
                break;
            }
            case Condition.AGREE: {
                System.out.printf("%s %s кивнул.%n", this.getName(), this.getSurname());
                break;
            }
        }
    }
}
