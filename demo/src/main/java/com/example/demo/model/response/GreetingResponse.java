package com.example.demo.model.response;

public class GreetingResponse {
    private int n;
    private String greet;

    public GreetingResponse(String greet) {
        this.n++;
        this.greet = greet;
    }

    public GreetingResponse() {
    }

    public int getN() {
        return n;
    }

    public String getGreet() {
        return greet;
    }

    @Override
    public String toString() {
        return "GreetingResponse{" +
                "n=" + n +
                ", greet='" + greet + '\'' +
                '}';
    }
}
