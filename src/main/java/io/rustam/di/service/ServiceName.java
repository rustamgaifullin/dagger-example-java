package io.rustam.di.service;

import javax.inject.Inject;

public class ServiceName implements Name {
    private final String name;

    @Inject
    public ServiceName() {
        this.name = "Service name";
    }

    @Override
    public String getStringName() {
        return name;
    }
}