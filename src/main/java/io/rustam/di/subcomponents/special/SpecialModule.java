package io.rustam.di.subcomponents.special;

import dagger.Module;
import dagger.Provides;
import io.rustam.di.service.ServiceScope;

@Module
public class SpecialModule {

    @Provides
    @ServiceScope
    public SpecialService specialService() {
        return new SpecialService();
    }
}