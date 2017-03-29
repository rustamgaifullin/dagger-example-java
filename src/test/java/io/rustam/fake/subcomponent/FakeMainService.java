package io.rustam.fake.subcomponent;

import io.rustam.subcomponents.di.common.NetworkUtils;
import io.rustam.subcomponents.di.service.Name;
import io.rustam.subcomponents.di.flow.main.MainResponse;
import io.rustam.subcomponents.di.flow.main.MainService;

public class FakeMainService extends MainService {
    private final NetworkUtils networkUtils;
    private final Name serviceName;

    public FakeMainService(NetworkUtils networkUtils, Name serviceName) {
        super(networkUtils, serviceName);

        this.networkUtils = networkUtils;
        this.serviceName = serviceName;
    }

    @Override
    public MainResponse getResponse() {
        return new MainResponse(serviceName, networkUtils.getUrl(), "fake");
    }
}