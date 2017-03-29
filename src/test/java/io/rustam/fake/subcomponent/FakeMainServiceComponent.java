package io.rustam.fake.subcomponent;

import dagger.Subcomponent;
import io.rustam.MainApplicationTest;
import io.rustam.subcomponents.di.service.ServiceScope;
import io.rustam.subcomponents.di.flow.main.MainServiceModule;

@Subcomponent(modules = MainServiceModule.class)
@ServiceScope
public interface FakeMainServiceComponent {
    void inject(MainApplicationTest mainApplication);
}