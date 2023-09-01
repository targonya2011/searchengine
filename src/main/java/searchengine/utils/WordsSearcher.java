package searchengine.utils;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import searchengine.config.Connection;
import searchengine.model.Page;

import java.io.IOException;
import java.util.Comparator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.RecursiveTask;

public class WordsSearcher extends RecursiveTask<String> {

    private Connection connection;

    private String url;

    private Page page;
    private CopyOnWriteArraySet<String> allWords;

    public WordsSearcher(String url, CopyOnWriteArraySet<String> allWords) {
        this.url = url;
        this.allWords = allWords;
    }
    public WordsSearcher(String url) {
        this.url = url;
        this.allWords = new CopyOnWriteArraySet<>();
    }


    @Override
    protected String compute() {

        ConcurrentSkipListSet<WordsSearcher> allTask = new ConcurrentSkipListSet<>(Comparator.comparing(o -> o.url));
        try {
            Thread.sleep(connection.getTimeout());
            Document doc = Jsoup.connect(url)
                    .userAgent(connection.getUseragent())
                    .referrer(connection.getReferer())
                    .ignoreContentType(true)
                    .maxBodySize(0)
                    .get();


        } catch (InterruptedException | IOException e) {
            throw new RuntimeException(e);
        }


        return null;
    }
}
