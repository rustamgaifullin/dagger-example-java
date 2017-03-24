package io.rustam.di;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module
public class AppModule {

    @Singleton
    @Provides
    public Something something() {
        return new Something();
    }
}