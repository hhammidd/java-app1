package com.hamidApp1.model.common;

public class ServiceOperationBean {
    private String CodeOutput;
    private String DescOutput;

    public ServiceOperationBean(String codeOutput, String descOutput) {
        CodeOutput = codeOutput;
        DescOutput = descOutput;
    }

    public ServiceOperationBean() {
    }

    public String getCodeOutput() {
        return CodeOutput;
    }

    public void setCodeOutput(String codeOutput) {
        CodeOutput = codeOutput;
    }

    public String getDescOutput() {
        return DescOutput;
    }

    public void setDescOutput(String descOutput) {
        DescOutput = descOutput;
    }

    @Override
    public String toString() {
        return "ServiceOperationBean{" +
                "CodeOutput='" + CodeOutput + '\'' +
                ", DescOutput='" + DescOutput + '\'' +
                '}';
    }
}
