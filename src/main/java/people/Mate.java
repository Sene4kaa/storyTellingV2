package main.java.people;

import main.java.explanations.Condition;

public class Mate extends Human{

    public Mate(String name, String surname) {

        super(name, surname);
        validate();
    }

    public void setCondition(Condition c) {

        this.condition = c;

        switch (this.condition) {
            case SAYING: {
                System.out.printf("%s %s промычал:%n", this.getName(), this.getSurname());
                break;
            }
            case KEEPING_SILENT: {
                System.out.printf("%s %s умолк.%n", this.getName(), this.getSurname());
                break;
            }
            case WONDERING: {
                System.out.printf("%s %s огошнулся.%n", this.getName(), this.getSurname());
                break;
            }
            case IMPATIENT: {
                System.out.printf("%s %s забычил.%n", this.getName(), this.getSurname());
                break;
            }
            case AGREE: {
                System.out.printf("%s %s кивнул.%n", this.getName(), this.getSurname());
                break;
            }
        }
    }
}
