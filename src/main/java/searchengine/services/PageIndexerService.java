package searchengine.services;

import org.springframework.stereotype.Service;
import searchengine.dto.statistics.IndexingResponse;
import searchengine.model.Page;

public interface PageIndexerService {
    void indexHtml(String html, Page indexingPage);

    void refreshIndex(String html, Page refreshPage);

    IndexingResponse startIndexing();
}
