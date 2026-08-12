package dev.rmarcos.jobboard.domain.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public final class Response {
    private Instant instant;
    private int status;
    private String resonPrase;
    private List<String> payload;
    private String requestUri;
}
