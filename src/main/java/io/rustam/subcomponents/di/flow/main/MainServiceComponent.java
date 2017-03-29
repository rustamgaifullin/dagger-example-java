package io.rustam.subcomponents.di.flow.main;

import dagger.Subcomponent;
import io.rustam.subcomponents.MainApplication;
import io.rustam.subcomponents.di.service.ServiceScope;

@Subcomponent(modules = MainServiceModule.class)
@ServiceScope
public interface MainServiceComponent {
    void inject(MainApplication mainApplication);
}