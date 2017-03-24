package io.rustam.fake;

import dagger.Component;
import io.rustam.di.common.NetworkModule;
import io.rustam.di.service.ServiceModule;
import io.rustam.di.subcomponents.main.MainServiceModule;
import io.rustam.fake.subcomponent.FakeMainServiceComponent;

import javax.inject.Singleton;

@Component(modules = {ServiceModule.class, NetworkModule.class})
@Singleton
public interface FakeServiceComponent {
    FakeMainServiceComponent plus(MainServiceModule module);
}