package io.rustam.subcomponents.di.flow.special;

import dagger.Module;
import dagger.Provides;
import io.rustam.subcomponents.di.service.ServiceScope;

@Module
public class SpecialModule {

    @Provides
    @ServiceScope
    public SpecialService specialService() {
        return new SpecialService();
    }
}