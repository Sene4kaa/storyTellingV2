package main.java.people;

import main.java.explanations.Condition;

public class Robber extends Human{

    public Robber(String name, String surname) {

        super(name, surname);
        validate();
    }

    public void setCondition(Condition c) {

        this.condition = c;

        switch (this.condition) {
            case SAYING: {
                System.out.printf("%s %s заорал:%n", this.getName(), this.getSurname());
                break;
            }
            case KEEPING_SILENT: {
                System.out.printf("%s %s стих.%n", this.getName(), this.getSurname());
                break;
            }
            case WONDERING: {
                System.out.printf("%s %s упал.%n", this.getName(), this.getSurname());
                break;
            }
            case IMPATIENT: {
                System.out.printf("%s %s ударил собеседника.%n", this.getName(), this.getSurname());
                break;
            }
            case AGREE: {
                System.out.printf("%s %s угостил тортиком.%n", this.getName(), this.getSurname());
                break;
            }
        }
    }
}
