package main.java.exceptions;

public class NameException extends RuntimeException{

    private final String name;

    public NameException(String message, String name) {

        super(message);
        this.name = name;
    }

    @Override
    public String getMessage(){

        return this.name + ": не то имя ты выбрал братишка - ";
    }
}
