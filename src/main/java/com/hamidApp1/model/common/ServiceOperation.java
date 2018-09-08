package com.hamidApp1.model.common;

public class ServiceOperation {
    private String CodeOutput;
    private String DescOutput;

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
        return "ServiceOperation{" +
                "CodeOutput='" + CodeOutput + '\'' +
                ", DescOutput='" + DescOutput + '\'' +
                '}';
    }
}
