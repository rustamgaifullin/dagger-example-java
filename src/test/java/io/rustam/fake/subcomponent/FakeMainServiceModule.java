package io.rustam.fake.subcomponent;

import io.rustam.di.common.NetworkUtils;
import io.rustam.di.service.Name;
import io.rustam.di.subcomponents.main.MainService;
import io.rustam.di.subcomponents.main.MainServiceModule;

public class FakeMainServiceModule extends MainServiceModule{
    @Override
    public MainService subService(NetworkUtils networkUtils, Name serviceName) {
        return new FakeMainService(networkUtils, serviceName);
    }
}