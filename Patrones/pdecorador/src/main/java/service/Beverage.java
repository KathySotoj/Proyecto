package service;

import lombok.Getter;

public abstract class Beverage {
    @Getter
    String description;

    public abstract double cost();
}