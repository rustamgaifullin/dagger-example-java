package io.rustam;

import io.rustam.di.service.DaggerServiceComponent;
import io.rustam.di.service.ServiceName;
import io.rustam.di.subcomponents.main.SubService;
import io.rustam.di.subcomponents.main.SubServiceModule;

import javax.inject.Inject;

public class MainApplication {
    @Inject
    SubService subService;

    @Inject
    ServiceName serviceName;

    public MainApplication() {
        DaggerServiceComponent.create().plus(new SubServiceModule()).inject(this);
    }

    public String getResult() {
        return subService.getResponse().getStringResponse();
    }

    public String getServiceName() {
        return serviceName.getName();
    }
}