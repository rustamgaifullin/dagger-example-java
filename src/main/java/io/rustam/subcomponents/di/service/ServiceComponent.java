package io.rustam.subcomponents.di.service;

import dagger.Component;
import io.rustam.subcomponents.di.common.NetworkModule;
import io.rustam.subcomponents.di.flow.main.MainServiceComponent;
import io.rustam.subcomponents.di.flow.main.MainServiceModule;
import io.rustam.subcomponents.di.flow.special.SpecialModule;
import io.rustam.subcomponents.di.flow.special.SpecialServiceComponent;

import javax.inject.Singleton;

@Component(modules = {ServiceModule.class, NetworkModule.class})
@Singleton
public interface ServiceComponent {
    MainServiceComponent plus(MainServiceModule module);
    SpecialServiceComponent plus(SpecialModule module);
}