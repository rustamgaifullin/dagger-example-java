package io.rustam.di.subcomponents.main;

import dagger.Module;
import dagger.Provides;
import io.rustam.di.common.NetworkUtils;
import io.rustam.di.service.Name;
import io.rustam.di.service.ServiceScope;

@Module
public class MainServiceModule {
    @ServiceScope
    @Provides
    public MainService subService(NetworkUtils networkUtils, Name serviceName) {
        return new MainService(networkUtils, serviceName);
    }
}