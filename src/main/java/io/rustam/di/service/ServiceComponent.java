package io.rustam.di.service;

import dagger.Component;
import io.rustam.di.common.NetworkModule;
import io.rustam.di.subcomponents.main.MainServiceComponent;
import io.rustam.di.subcomponents.main.MainServiceModule;
import io.rustam.di.subcomponents.special.SpecialModule;
import io.rustam.di.subcomponents.special.SpecialServiceComponent;

import javax.inject.Singleton;

@Component(modules = {ServiceModule.class, NetworkModule.class})
@Singleton
public interface ServiceComponent {
    MainServiceComponent plus(MainServiceModule module);
    SpecialServiceComponent plus(SpecialModule module);
}