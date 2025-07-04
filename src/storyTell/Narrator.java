package storyTell;

public record Narrator(String name, int year) {

    public Narrator{
        if (year < 1930 || year > 2025) { year = 2003; }
    }

    public String startStory(){

        return name + " " + year + " года рождения начинает свой рассказ...";
    }
}
