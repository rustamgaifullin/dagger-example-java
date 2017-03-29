package io.rustam.components.di;

import dagger.Component;
import io.rustam.components.WikipediaApplication;

import javax.inject.Singleton;


@Component(modules = {NetworkModule.class, WikipediaModule.class})
@Singleton
public interface WikipediaComponent {
    void inject(WikipediaApplication wikipediaClient);
}
