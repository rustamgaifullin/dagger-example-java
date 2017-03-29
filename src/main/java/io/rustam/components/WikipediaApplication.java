package io.rustam.components;

import io.rustam.components.di.DaggerWikipediaComponent;
import io.rustam.components.di.WikipediaClient;

import javax.inject.Inject;

public class WikipediaApplication {
    @Inject
    WikipediaClient client;

    public WikipediaApplication() {
        DaggerWikipediaComponent.create().inject(this);
    }

    public static void main(String[] args) {
        WikipediaApplication wikipediaApplication = new WikipediaApplication();
        System.out.println(wikipediaApplication.client.getContent("Linux"));
    }
}
