package org.paualgo.spot;

public class NoSolutionException extends RuntimeException{
    @Override
    public String getMessage() {
        return "No solution!";
    }
}
