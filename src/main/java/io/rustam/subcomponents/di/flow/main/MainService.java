package io.rustam.subcomponents.di.flow.main;

import io.rustam.subcomponents.di.common.NetworkUtils;
import io.rustam.subcomponents.di.service.Name;

import javax.inject.Inject;

public class MainService {
    private final NetworkUtils networkUtils;
    private final Name serviceName;

    @Inject
    public MainService(NetworkUtils networkUtils, Name serviceName) {
        this.networkUtils = networkUtils;
        this.serviceName = serviceName;
    }

    public MainResponse getResponse() {
        return new MainResponse(serviceName, networkUtils.getUrl(), " response");
    }
}