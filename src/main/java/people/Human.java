package main.java.people;

import java.util.Random;
import main.java.exceptions.NameException;
import main.java.explanations.Condition;
import main.java.explanations.Items;

public abstract class Human{

    protected Condition condition;
    protected Items items;
    private final String name;
    private final String surname;

    protected Human(String name, String surname) throws NameException{

        this.name = name;
        this.surname = surname;

        Items[] values = Items.values();
        Random random = new Random();

        this.items = values[random.nextInt(values.length)];
    }

    public void sayPhrase(String n){

        System.out.println(n);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public abstract void setCondition(Condition c);

    public String getItems(){
        return items.getDescription();
    }

    protected void validate() throws NameException {

        if (name.length() > 10 ) { throw new NameException("Слишком длинное имя", name); }
        else if (name.length() < 3) { throw new NameException("Слишком короткое имя", name); }
    }

    @Override
    public String toString(){

        return getClass().getName() + ", " + name + " " + surname;
    }

    @Override
    public int hashCode(){

        return name.hashCode() + surname.hashCode();
    }

    @Override
    public boolean equals(Object object){

        return object instanceof Human;
    }
}
