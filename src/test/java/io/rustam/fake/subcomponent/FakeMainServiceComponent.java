package io.rustam.fake.subcomponent;

import dagger.Subcomponent;
import io.rustam.MainApplicationTest;
import io.rustam.di.service.ServiceScope;
import io.rustam.di.subcomponents.main.MainServiceModule;

@Subcomponent(modules = MainServiceModule.class)
@ServiceScope
public interface FakeMainServiceComponent {
    void inject(MainApplicationTest mainApplication);
}