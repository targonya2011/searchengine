package searchengine.dto.statistics;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ErrorResponse {
    private boolean result;
    private String error;

    public ErrorResponse(String error) {
        this.error = error;
    }
}