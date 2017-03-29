package io.rustam.subcomponents;

import io.rustam.subcomponents.di.service.DaggerServiceComponent;
import io.rustam.subcomponents.di.flow.special.SpecialModule;
import io.rustam.subcomponents.di.flow.special.SpecialService;

import javax.inject.Inject;


public class SpecialApplication {
    @Inject
    SpecialService specialService;

    public SpecialApplication() {
        DaggerServiceComponent.create().plus(new SpecialModule()).inject(this);
    }
}