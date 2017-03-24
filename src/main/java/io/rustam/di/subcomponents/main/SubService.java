package io.rustam.di.subcomponents.main;

import io.rustam.di.common.NetworkUtils;
import io.rustam.di.service.ServiceName;

import javax.inject.Inject;

public class SubService {
    private final NetworkUtils networkUtils;
    private final ServiceName serviceName;

    @Inject
    public SubService(NetworkUtils networkUtils, ServiceName serviceName) {
        this.networkUtils = networkUtils;
        this.serviceName = serviceName;
    }

    public SubResponse getResponse() {
        return new SubResponse(serviceName.getName() + ": " + networkUtils.getUrl().getStringUrl() + " response");
    }
}