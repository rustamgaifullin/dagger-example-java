package io.rustam.di.subcomponents.main;

import dagger.Module;
import dagger.Provides;
import io.rustam.di.common.NetworkUtils;
import io.rustam.di.service.ServiceName;
import io.rustam.di.service.ServiceScope;

@Module
public class SubServiceModule {
    @ServiceScope
    @Provides
    public SubService subService(NetworkUtils networkUtils, ServiceName serviceName) {
        return new SubService(networkUtils, serviceName);
    }
}