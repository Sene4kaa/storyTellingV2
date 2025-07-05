package main.java.explanations;

public enum Items {

    SHIP("корабль"),
    WEAPON("оружие"),
    WALLET("кошелек"),
    PEN("ручка"),
    HOUSE("дом"),
    FOOD("еда"),
    STAIRS("лестница");

    public final String description;

    Items(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}
