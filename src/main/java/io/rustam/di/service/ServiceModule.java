package io.rustam.di.service;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class ServiceModule {
    @Provides
    @Singleton
    public ServiceName serviceName() {
        return new ServiceName();
    }
}