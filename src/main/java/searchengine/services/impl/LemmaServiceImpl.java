package searchengine.services.impl;

import org.springframework.stereotype.Service;
import searchengine.services.LemmaService;

import java.io.IOException;
import java.util.Map;

@Service
public class LemmaServiceImpl implements LemmaService {
    @Override
    public Map<String, Integer> getLemmasFromText(String text) throws IOException {
        return null;
    }
}
