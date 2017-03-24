package io.rustam.di.subcomponents.main;

import io.rustam.di.common.NetworkUtils;
import io.rustam.di.service.Name;

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