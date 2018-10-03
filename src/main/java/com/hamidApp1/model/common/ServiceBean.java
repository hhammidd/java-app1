package com.hamidApp1.model.common;

public class ServiceBean {
    private Integer numRecTot;
    private String CodeOutput;
    private String DescOutput;

    public ServiceBean(Integer numRecTot, String codeOutput, String descOutput) {
        this.numRecTot = numRecTot;
        CodeOutput = codeOutput;
        DescOutput = descOutput;
    }

    public ServiceBean() {
    }

    public Integer getNumRecTot() {
        return numRecTot;
    }

    public void setNumRecTot(Integer numRecTot) {
        this.numRecTot = numRecTot;
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
}
