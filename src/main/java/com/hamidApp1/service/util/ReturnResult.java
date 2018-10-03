package com.hamidApp1.service.util;

import com.hamidApp1.model.common.ServiceBean;
import com.hamidApp1.model.common.ServiceOperationBean;

public final class ReturnResult {
    private ReturnResult() {
    }
    private static final char BACKSLASH_ASCII_CODE = 92;
    private static final char INVERTED_COMMA_ASCII_CODE = 34;

    public static ServiceOperationBean getOperationResult(String strCodice, String strDescrizione) {
        ServiceOperationBean serviceBeanObj = new ServiceOperationBean();
        char slash = BACKSLASH_ASCII_CODE;
        int j = 0;
        int a;
        if (strDescrizione != null && strDescrizione.length() > 0) {
            if (strDescrizione.charAt(strDescrizione.length() - 1) == 10) {
                strDescrizione = new String(strDescrizione.substring(0, strDescrizione.length() - 1));
            }

            while ((a = strDescrizione.indexOf(INVERTED_COMMA_ASCII_CODE, j)) > -1) {
                if (strDescrizione.charAt(a - 1) != slash) {
                    strDescrizione = strDescrizione.substring(0, a) + slash + strDescrizione.substring(a);
                    j = a + 2;
                } else {
                    j = a + 1;
                }
            }
        }
        serviceBeanObj.setCodeOutput(strCodice);
        serviceBeanObj.setDescOutput(strDescrizione);
        return serviceBeanObj;
    }
}

