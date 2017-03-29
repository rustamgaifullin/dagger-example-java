package io.rustam.fake.subcomponent;

import io.rustam.subcomponents.di.common.NetworkUtils;
import io.rustam.subcomponents.di.service.Name;
import io.rustam.subcomponents.di.flow.main.MainService;
import io.rustam.subcomponents.di.flow.main.MainServiceModule;

public class FakeMainServiceModule extends MainServiceModule{
    @Override
    public MainService subService(NetworkUtils networkUtils, Name serviceName) {
        return new FakeMainService(networkUtils, serviceName);
    }
}