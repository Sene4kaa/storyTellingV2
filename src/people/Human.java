package people;

import java.util.EnumSet;
import java.util.Random;
import explanations.*;
import exceptions.NameException;

abstract public class Human{

    protected Condition condition;
    protected Items items;
    private String name;
    private String surname;
    private final int age;

    public Human(String name, String surname, int age) throws NameException{

        // if (name.length() > 10 || name.length() < 2) throw new NameException("Ошибка", name);
        // validate();
        this.name = name;
        this.surname = surname;
        this.age = age;

        Items[] values = Items.values();
        Random random = new Random();

        this.items = values[random.nextInt(values.length)];
    }

    public void sayPhrase(String n){

        System.out.println(n);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public abstract void setCondition(Condition c);

    public String getItems(){
        return this.items.getDescription();
    }

    protected void validate() throws NameException {

        if (name.length() > 10 ) { throw new NameException("Слишком длинное имя", name); }
        else if (name.length() < 3) { throw new NameException("Слишком короткое имя", name); }
    }
}
