package io.rustam.di;

import dagger.Component;
import io.rustam.MainApplication;

import javax.inject.Singleton;

@Component(modules = AppModule.class)
@Singleton
public interface AppComponent {
    void inject(MainApplication mainApplication);
}