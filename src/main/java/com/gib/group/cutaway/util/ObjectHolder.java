package com.gib.group.cutaway.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ObjectHolder {

    public static final TypeReference<Map<String, Boolean>> ACCESS_BUCKETS_REFERENCE = new TypeReference<>() {};
    public static final TypeReference<List<String>> ROUTE_REFERENCE = new TypeReference<>() {};
    public static final TypeReference<String> RESPONSE_REFERENCE = new TypeReference<>() {};

    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static ObjectMapper getObjectMapper() {
        return OBJECT_MAPPER;
    }

    public static <T> T parseJson(String json, TypeReference<T> typeReference) {
        try {
            return getObjectMapper().readerFor(typeReference).readValue(json);
        } catch (Exception ex) {
            log.error("Couldn't parse json {}", json, ex);
            throw new IllegalArgumentException("Couldn't parse json" + ex);
        }
    }

    public static String writeResponseAsString(Object response) {
        try {
            return getObjectMapper().writeValueAsString(response);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}