package io.rustam.di.subcomponents.main;

import dagger.Subcomponent;
import io.rustam.MainApplication;
import io.rustam.di.service.ServiceScope;

@Subcomponent(modules = MainServiceModule.class)
@ServiceScope
public interface MainServiceComponent {
    void inject(MainApplication mainApplication);
}