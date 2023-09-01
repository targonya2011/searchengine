package searchengine.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import searchengine.config.Connection;
import searchengine.dto.statistics.IndexingResponse;
import searchengine.model.Page;
import searchengine.services.PageIndexerService;

@Service
public class PageIndexerServiceImpl implements PageIndexerService {

    private Connection connection;



    @Override
    public void indexHtml(String html, Page indexingPage) {

    }

    @Override
    public void refreshIndex(String html, Page refreshPage) {

    }

    @Override
    public IndexingResponse startIndexing() {
        IndexingResponse hi = new IndexingResponse(true, "indexing starting");
        return hi;
    }


}
