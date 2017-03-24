package io.rustam.di.service;

import dagger.Component;
import io.rustam.di.common.NetworkModule;
import io.rustam.di.subcomponents.main.SubServiceComponent;
import io.rustam.di.subcomponents.main.SubServiceModule;
import io.rustam.di.subcomponents.special.SpecialModule;
import io.rustam.di.subcomponents.special.SpecialServiceComponent;

import javax.inject.Singleton;

@Component(modules = {ServiceModule.class, NetworkModule.class})
@Singleton
public interface ServiceComponent {
    SubServiceComponent plus(SubServiceModule module);
    SpecialServiceComponent plus(SpecialModule module);
}