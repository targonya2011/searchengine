package searchengine.dto.statistics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class IndexingResponse {

    private boolean result;
    private String error;



    @Override
    public String toString() {
        return "{\"result\": " + this.result + ", \"error\": \"" + this.error + "\"}";
    }
}
