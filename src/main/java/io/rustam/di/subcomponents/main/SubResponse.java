package io.rustam.di.subcomponents.main;

public class SubResponse {
    private final String response;

    public SubResponse(String response) {
        this.response = response;
    }

    public String getStringResponse() {
        return response;
    }
}