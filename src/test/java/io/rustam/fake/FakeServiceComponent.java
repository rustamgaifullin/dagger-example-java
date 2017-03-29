package io.rustam.fake;

import dagger.Component;
import io.rustam.subcomponents.di.common.NetworkModule;
import io.rustam.subcomponents.di.service.ServiceModule;
import io.rustam.subcomponents.di.flow.main.MainServiceModule;
import io.rustam.fake.subcomponent.FakeMainServiceComponent;

import javax.inject.Singleton;

@Component(modules = {ServiceModule.class, NetworkModule.class})
@Singleton
public interface FakeServiceComponent {
    FakeMainServiceComponent plus(MainServiceModule module);
}