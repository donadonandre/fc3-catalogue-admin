package com.fullcycle.catalogue.admin.application;

public abstract class UseCase<IN, OUT> {

    public abstract OUT execute(IN input);

    public abstract void validate(IN input);

}