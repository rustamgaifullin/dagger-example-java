package io.rustam.subcomponents.di.common;

public class UrlImpl implements Url {
    private static final String URL = "https://rustamgaifullin.github.io/";

    @Override
    public String getStringUrl() {
        return URL;
    }
}