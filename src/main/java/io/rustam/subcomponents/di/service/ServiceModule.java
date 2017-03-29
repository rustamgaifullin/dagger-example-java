package io.rustam.subcomponents.di.service;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class ServiceModule {
    @Provides
    @Singleton
    public Name serviceName() {
        return new ServiceName();
    }
}