package com.udacity.gradle.builditbigger.backend;

import com.udacity.gradle.builditbigger.javajokes.JokeService;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {

    private final JokeService jokeService = new JokeService();

    public String getData() {
        return jokeService.getJoke();
    }

}