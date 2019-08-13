package com.ahmed.gamal.jokes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class JokesMaker {
    private static List<String> jokes;

    public JokesMaker() {
        jokes = new ArrayList<>();
        jokes.add("first joke ");
        jokes.add("second joke ");
        jokes.add("third joke ");
    }

    public static String getJoke() {
        Random random = new Random();
        return jokes.get(random.nextInt(jokes.size()));
    }

}
