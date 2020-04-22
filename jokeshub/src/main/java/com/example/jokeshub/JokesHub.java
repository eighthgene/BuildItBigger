package com.example.jokeshub;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokesHub {

    private static final List<String> jokesList = new ArrayList<>();

    private static JokesHub instance = null;


    private JokesHub() {
        generateFunnyJokes();
    }

    public static JokesHub getInstance(){
        if (instance == null) {
            instance = new JokesHub();
        }
        return instance;
    }

    private void generateFunnyJokes() {
        jokesList.add("A chicken sandwidch walked into the bar, ordered some food and beer. The bartender says: " +
                "\"Sorry, we don't serve food here\".Because people keep hitting them with dictionaries.");
        jokesList.add("Do not meddle in the affairs of cats, for they are subtle and will whiz on your computer.");
        jokesList.add("I wonder if you choke a smurf, what color does it turn?");
        jokesList.add("I'd explain it to you, but your brain would explode.\n");
        jokesList.add("\tI've got the ship, you've got the harbor ... what say we tie up for the night?");
        jokesList.add("\tIt's no accident that stressed spelled backwards is desserts.");
    }

    public String getRandomJoke() {
        int jokeNumber = new Random().nextInt((jokesList.size() - 1));
        return jokesList.get(jokeNumber);
    }
}
