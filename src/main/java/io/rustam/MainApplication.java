package io.rustam;

import io.rustam.di.service.DaggerServiceComponent;
import io.rustam.di.service.ServiceName;
import io.rustam.di.subcomponents.main.MainService;
import io.rustam.di.subcomponents.main.MainServiceModule;

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