package io.rustam;

import io.rustam.di.service.DaggerServiceComponent;
import io.rustam.di.subcomponents.special.SpecialModule;
import io.rustam.di.subcomponents.special.SpecialService;

import javax.inject.Inject;

public class SpecialApplication {
    @Inject
    SpecialService specialService;

    public SpecialApplication() {
        DaggerServiceComponent.create().plus(new SpecialModule()).inject(this);
    }
}