package searchengine.services;

import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

public interface LemmaService {
    Map<String, Integer> getLemmasFromText(String text) throws IOException;
}
