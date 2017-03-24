package io.rustam.di.service;

import javax.inject.Inject;

public class ServiceName {
    private final String name;

    @Inject
    public ServiceName() {
        this.name = "Service name";
    }

    public String getName() {
        return name;
    }
}