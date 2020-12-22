package com.gib.group.cutaway.util;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.springframework.web.util.UriComponentsBuilder;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class UriHelper {
    private static final String HTTP_PATTERN = "http://%s";

    public static UriComponentsBuilder createFromHttpUrl(String host) {
        return  UriComponentsBuilder.fromHttpUrl(String.format(HTTP_PATTERN, host));
    }
}
