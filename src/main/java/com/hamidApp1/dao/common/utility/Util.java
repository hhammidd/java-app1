package com.hamidApp1.dao.common.utility;

import java.text.NumberFormat;

public class Util {
    private Util() {
    }

    public static String formatNumber(Integer i) {
        return NumberFormat.getInstance().format(i);
    }

}
