package searchengine.services.impl;

import lombok.RequiredArgsConstructor;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.stereotype.Service;
import searchengine.config.Site;
import searchengine.config.SitesList;
import searchengine.model.SitePage;
import searchengine.model.Status;
import searchengine.repository.PageRepository;
import searchengine.repository.SiteRepository;
import searchengine.services.ApiService;

import java.io.IOException;
import java.net.URL;

@Service
@RequiredArgsConstructor
public class ApiServiceImpl implements ApiService {

    private PageRepository pageRepository;
    private SiteRepository siteRepository;
    private SitesList sitesList;

    private Site site;

    @Override
    public void startIndexing() {


    }
    private void addSitePagesToDB() {

    }
    @Override
    public void refreshPage(SitePage sitePage, URL url) {

    }


}
