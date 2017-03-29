package io.rustam.components.di;


import io.rustam.components.retrofit.WikipediaService;

import java.io.IOException;

public class WikipediaClient {

    private final WikipediaService wikipediaService;

    public WikipediaClient(WikipediaService wikipediaService) {
        this.wikipediaService = wikipediaService;
    }

    public String getContent(String title) {
        String response;

        try {
            // I know it's synchronous, what ever...
            response = wikipediaService.content(title).execute().body().string();
        } catch (IOException e) {
            response = e.getMessage();
        }

        return response;
    }
}
