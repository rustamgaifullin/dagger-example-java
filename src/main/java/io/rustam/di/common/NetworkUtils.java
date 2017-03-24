package io.rustam.di.common;

import javax.inject.Inject;

public class NetworkUtils {

    @Inject
    public NetworkUtils() {}

    public Url getUrl() {
        return new Url();
    }
}