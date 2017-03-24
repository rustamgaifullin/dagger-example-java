package io.rustam.di.subcomponents.special;

import dagger.Subcomponent;
import io.rustam.SpecialApplication;
import io.rustam.di.service.ServiceScope;

@Subcomponent(modules = SpecialModule.class)
@ServiceScope
public interface SpecialServiceComponent {
    void inject(SpecialApplication specialApplication);
}