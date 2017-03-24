package io.rustam.di.subcomponents.main;

import dagger.Subcomponent;
import io.rustam.MainApplication;
import io.rustam.di.service.ServiceScope;

@Subcomponent(modules = SubServiceModule.class)
@ServiceScope
public interface SubServiceComponent {
    void inject(MainApplication mainApplication);
}