package io.rustam.subcomponents;

import io.rustam.subcomponents.di.service.DaggerServiceComponent;
import io.rustam.subcomponents.di.service.ServiceName;
import io.rustam.subcomponents.di.flow.main.MainService;
import io.rustam.subcomponents.di.flow.main.MainServiceModule;

import javax.inject.Inject;

public class MainApplication {
    @Inject
    MainService mainService;

    @Inject
    ServiceName serviceName;

    public MainApplication() {
        DaggerServiceComponent.create().plus(new MainServiceModule()).inject(this);
    }

    public String getResult() {
        return mainService.getResponse().getStringResponse();
    }

    public String getServiceName() {
        return serviceName.getStringName();
    }
}