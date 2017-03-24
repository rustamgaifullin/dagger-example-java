package io.rustam.di.subcomponents.main;

import io.rustam.di.common.Url;
import io.rustam.di.service.Name;

public class MainResponse {
    private final String response;

    public MainResponse(Name name, Url url, String response) {
        this.response = String.format("%s: %s - %s", name.getStringName(), url.getStringUrl(), response);
    }

    public String getStringResponse() {
        return response;
    }
}