package main.java.people;

import main.java.explanations.Condition;

public class Author extends Human{

    public Author(String name, String surname) {

        super(name, surname);
        validate();
    }

    public void setCondition(Condition c) {

        this.condition = c;

        switch (this.condition) {
            case SAYING: {
                System.out.printf("%s %s сказал:%n", this.getName(), this.getSurname());
                break;
            }
            case KEEPING_SILENT: {
                System.out.printf("%s %s замолчал.%n", this.getName(), this.getSurname());
                break;
            }
            case WONDERING: {
                System.out.printf("%s %s удивился.%n", this.getName(), this.getSurname());
                break;
            }
            case IMPATIENT: {
                System.out.printf("%s %s разозлился.%n", this.getName(), this.getSurname());
                break;
            }
            case AGREE: {
                System.out.printf("%s %s согласился.%n", this.getName(), this.getSurname());
                break;
            }
        }
    }
}
