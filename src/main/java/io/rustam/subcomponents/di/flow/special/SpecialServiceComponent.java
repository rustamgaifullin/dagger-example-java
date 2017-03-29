package io.rustam.subcomponents.di.flow.special;

import dagger.Subcomponent;
import io.rustam.subcomponents.SpecialApplication;
import io.rustam.subcomponents.di.service.ServiceScope;

@Subcomponent(modules = SpecialModule.class)
@ServiceScope
public interface SpecialServiceComponent {
    void inject(SpecialApplication specialApplication);
}