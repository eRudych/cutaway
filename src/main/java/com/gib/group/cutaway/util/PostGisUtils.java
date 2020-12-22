package com.gib.group.cutaway.util;

import com.easypark.pgadmin.find.color.ProbabilityColor;
import com.google.common.collect.Lists;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.easypark.pgadmin.find.color.ProbabilityColor.*;
import static com.easypark.pgadmin.model.StringConstants.SPACE;
import static java.util.Collections.emptyList;
import static liquibase.sqlgenerator.core.MarkChangeSetRanGenerator.COMMA;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class PostGisUtils {

    private static final String REGEX = "\\(\\(|\\)\\)|,";
    private static final String GREY_COLOR = "#494949";

    public static List<List<Double>> parsePolygon(String postGisPolygon) {
        if (!postGisPolygon.contains("POLYGON") || postGisPolygon.contains("EMPTY")) {
            log.info("Can`t parse polygon from string: {}", postGisPolygon);
            return emptyList();
        }
        return processingString(postGisPolygon);
    }

    private static List<List<Double>> processingString(String postGisPolygon) {
        try {
            return Stream.of(postGisPolygon.split(REGEX))
                    .filter(StringUtils::containsWhitespace)
                    .map(str ->
                            Lists.newArrayList(Double.parseDouble(str.split(SPACE)[0]), Double.parseDouble(str.split(SPACE)[1])))
                    .collect(Collectors.toList());
        } catch (Exception e) {
            log.error("An error occurred during processing polygon: {}", postGisPolygon, e);
        }
        return emptyList();
    }

    public static List<List<Double>> coordinateToList(String coordinates) {
        Function<String, String> removeBrackets = value -> value.replaceAll("\\[|\\]", SPACE);
        List<Double> coordinateList = Arrays.stream(removeBrackets.apply(coordinates).split(COMMA))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        return Lists.partition(coordinateList, 2);
    }

    public static String getColorHash(double state, ProbabilityColor bayesianColor) {
        if (state == 0) {
            return GREY_COLOR;
        }
        return fetchColorHash(bayesianColor);
    }

    private static String fetchColorHash(ProbabilityColor bayesianColor) {
        if (YELLOW == bayesianColor || GREEN == bayesianColor) {
            return bayesianColor.getColorHash();
        }
        return RED.getColorHash();
    }
}
