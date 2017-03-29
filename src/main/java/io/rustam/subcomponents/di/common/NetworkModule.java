package io.rustam.subcomponents.di.common;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class NetworkModule {
    @Singleton
    @Provides
    public NetworkUtils networkUtils() {
        return new NetworkUtils();
    }
}