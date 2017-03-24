package io.rustam.fake;

import io.rustam.di.common.NetworkModule;
import io.rustam.di.common.NetworkUtils;
import io.rustam.di.common.Url;

public class FakeNetworkModule extends NetworkModule {
    @Override
    public NetworkUtils networkUtils() {
        return new FakeNetworkUtils();
    }

    private static class FakeNetworkUtils extends NetworkUtils {
        @Override
        public Url getUrl() {
            return () -> "http://fake.com";
        }
    }
}