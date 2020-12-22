package com.gib.group.cutaway.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jooq.Field;
import org.jooq.impl.DSL;
import org.jooq.util.postgres.PostgresDataType;

import static com.easypark.pgadmin.utils.ObjectHolder.getObjectMapper;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class JooqDataTypeConverter {

    public static Field<Object> asPostgresJson(Object object) {
        try {
            return DSL.value(getObjectMapper().writeValueAsString(object)).cast(PostgresDataType.JSON);
        } catch (JsonProcessingException e) {
            log.error("An error occurred during converting to Postgres JSON {}", object, e);
            throw new IllegalStateException("Can't convert to Postgres JSON");
        }
    }
}
