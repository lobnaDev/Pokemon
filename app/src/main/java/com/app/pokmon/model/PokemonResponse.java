package com.app.pokmon.model;

import java.util.ArrayList;

/**
 * Created by Lobna Babker on 12/8/2022.
 */
public class PokemonResponse {
    private int count;
    private String next, previous;
    private ArrayList<Pokemon> results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public ArrayList<Pokemon> getResults() {
        return results;
    }

    public void setResults(ArrayList<Pokemon> results) {
        this.results = results;
    }
}
