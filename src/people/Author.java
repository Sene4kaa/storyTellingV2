package people;

import java.util.Random;
import explanations.Condition;
import explanations.Items;

public class Author extends Human{

    public Author(String name, String surname, int age) {

        super(name, surname, age);
        validate();
    }

    public void setCondition(Condition c) {

        this.condition = c;

        switch (this.condition) {
            case Condition.SAYING: {
                System.out.printf("%s %s сказал:%n", this.getName(), this.getSurname());
                break;
            }
            case Condition.KEEPING_SILENT: {
                System.out.printf("%s %s замолчал.%n", this.getName(), this.getSurname());
                break;
            }
            case Condition.WONDERING: {
                System.out.printf("%s %s удивился.%n", this.getName(), this.getSurname());
                break;
            }
            case Condition.IMPATIENT: {
                System.out.printf("%s %s разозлился.%n", this.getName(), this.getSurname());
                break;
            }
            case Condition.AGREE: {
                System.out.printf("%s %s согласился.%n", this.getName(), this.getSurname());
                break;
            }
        }
    }
}
