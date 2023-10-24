package com.epam.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        boolean result = false;
        try {
            Number n = NumberUtils.createNumber(str);
            result = n != null && n.doubleValue() > 0;
        } catch (NumberFormatException ignoreIt) {
            // result is false
        }
        return result;
    }
}
