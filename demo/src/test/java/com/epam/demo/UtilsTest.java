package com.epam.demo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTest {
    public static Stream<Arguments> testCases() {
        return Stream.of(
            Arguments.of("1", List.of("-11.22", "0", "33", "87"), false),
            Arguments.of("2", List.of("11.22", "2", "33", "87"), true),
            Arguments.of("3", List.of("11", "0"), false),
            Arguments.of("4", null, false),
            Arguments.of("5", List.of(), false),
            Arguments.of("6", List.of(" "), false)
        );
    }

    @ParameterizedTest(name = "demo_{0}_test")
    @MethodSource(value = "testCases")
    void createArrayListTest(String name, List<String> sourceList, boolean expectedResult) {
        boolean actualResult = Utils.isAllPositiveNumbers(sourceList);
        assertEquals(expectedResult, actualResult);
    }
}