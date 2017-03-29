package io.rustam.components.di;

import dagger.Module;
import dagger.Provides;
import io.rustam.components.retrofit.WikipediaService;
import retrofit2.Retrofit;

import javax.inject.Singleton;

@Module
public class WikipediaModule {
    @Provides
    @Singleton
    public WikipediaClient wikipediaClient(WikipediaService wikipediaService) {
        return  new WikipediaClient(wikipediaService);
    }

    @Provides
    @Singleton
    public WikipediaService wikipediaService(Retrofit retrofit) {
        return retrofit.create(WikipediaService.class);
    }
}
