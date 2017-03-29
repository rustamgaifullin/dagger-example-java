package io.rustam.subcomponents.di.flow.main;

import dagger.Module;
import dagger.Provides;
import io.rustam.subcomponents.di.common.NetworkUtils;
import io.rustam.subcomponents.di.service.Name;
import io.rustam.subcomponents.di.service.ServiceScope;

@Module
public class MainServiceModule {
    @ServiceScope
    @Provides
    public MainService subService(NetworkUtils networkUtils, Name serviceName) {
        return new MainService(networkUtils, serviceName);
    }
}