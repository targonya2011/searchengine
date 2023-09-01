package searchengine.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import searchengine.dto.statistics.ErrorResponse;
import searchengine.dto.statistics.IndexingResponse;
import searchengine.dto.statistics.StatisticsResponse;
import searchengine.services.PageIndexerService;
import searchengine.services.StatisticsService;
import searchengine.services.impl.PageIndexerServiceImpl;

@RestController
@RequestMapping("/api")
public class ApiController {

    private final StatisticsService statisticsService;

    private final PageIndexerServiceImpl pageIndexerService;

    public ApiController(StatisticsService statisticsService, PageIndexerServiceImpl pageIndexerService) {
        this.statisticsService = statisticsService;
        this.pageIndexerService = pageIndexerService;
    }


    @GetMapping("/statistics")
    public ResponseEntity<StatisticsResponse> statistics() {
        return ResponseEntity.ok(statisticsService.getStatistics());
    }

    @GetMapping("/startIndexing")
    public ResponseEntity<Object> startIndexing() {
        IndexingResponse status = pageIndexerService.startIndexing();
        if (status.isResult()) {
            return ResponseEntity.ok(status);
        }
        return ResponseEntity.badRequest().body(new ErrorResponse("Индексация уже запущена"));

    }



}
