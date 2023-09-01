package searchengine.services;

import searchengine.model.SitePage;

import java.net.URL;

public interface ApiService {
    void startIndexing();

    void refreshPage(SitePage sitePage, URL url);
}
