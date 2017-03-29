package io.rustam.components.di;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

import javax.inject.Singleton;


@Module
public class NetworkModule {

    @Provides
    @Singleton
    public Retrofit retrofit() {
        return new Retrofit.Builder()
                .baseUrl("https://en.wikipedia.org/w/")
                .build();
    }
}
