package com.example.controller;

public class AdditionResult {
    private int param1;
    private int param2;
    private int result;

    public AdditionResult(int param1, int param2, int result) {
        this.param1=param1;
        this.param2 = param2;
        this.result = result;
    }

    public int getParam1() {
        return param1;
    }

    public void setParam1(int param1) {
        this.param1 = param1;
    }

    public int getParam2() {
        return param2;
    }

    public void setParam2(int param2) {
        this.param2 = param2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "AdditionResult{" +
                "param1=" + param1 +
                ", param2=" + param2 +
                ", result=" + result +
                '}';
    }
    // Constructors, getters, and setters
    // ...
}
