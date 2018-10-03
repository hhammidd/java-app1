package com.hamidApp1.model.report;

import java.math.BigDecimal;
import java.time.LocalDate;

public class StatsAlertedReportBeanFull {

    private LocalDate refDate;
    private String portfolio;
    private int alertedCases;
    private int from0to15Minutes;
    private int from16to30Minutes;
    private int from31to45Minutes;
    private int from46to60Minutes;
    private int from61to120Minutes;
    private int plus120Minutes;
    private BigDecimal percent0to15Minutes;
    private BigDecimal percent16to30Minutes;
    private BigDecimal percent31to45Minutes;
    private BigDecimal percent46to60Minutes;
    private BigDecimal percent61to120Minutes;
    private BigDecimal percentPlus120Minutes;
    private BigDecimal percent0to60Minutes;

    public StatsAlertedReportBeanFull() {
    }

    public StatsAlertedReportBeanFull(LocalDate refDate, String portfolio, int alertedCases, int from0to15Minutes, int from16to30Minutes, int from31to45Minutes, int from46to60Minutes, int from61to120Minutes, int plus120Minutes, BigDecimal percent0to15Minutes, BigDecimal percent16to30Minutes, BigDecimal percent31to45Minutes, BigDecimal percent46to60Minutes, BigDecimal percent61to120Minutes, BigDecimal percentPlus120Minutes, BigDecimal percent0to60Minutes) {
        this.refDate = refDate;
        this.portfolio = portfolio;
        this.alertedCases = alertedCases;
        this.from0to15Minutes = from0to15Minutes;
        this.from16to30Minutes = from16to30Minutes;
        this.from31to45Minutes = from31to45Minutes;
        this.from46to60Minutes = from46to60Minutes;
        this.from61to120Minutes = from61to120Minutes;
        this.plus120Minutes = plus120Minutes;
        this.percent0to15Minutes = percent0to15Minutes;
        this.percent16to30Minutes = percent16to30Minutes;
        this.percent31to45Minutes = percent31to45Minutes;
        this.percent46to60Minutes = percent46to60Minutes;
        this.percent61to120Minutes = percent61to120Minutes;
        this.percentPlus120Minutes = percentPlus120Minutes;
        this.percent0to60Minutes = percent0to60Minutes;
    }

    public LocalDate getRefDate() {
        return refDate;
    }

    public void setRefDate(LocalDate refDate) {
        this.refDate = refDate;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public int getAlertedCases() {
        return alertedCases;
    }

    public void setAlertedCases(int alertedCases) {
        this.alertedCases = alertedCases;
    }

    public int getFrom0to15Minutes() {
        return from0to15Minutes;
    }

    public void setFrom0to15Minutes(int from0to15Minutes) {
        this.from0to15Minutes = from0to15Minutes;
    }

    public int getFrom16to30Minutes() {
        return from16to30Minutes;
    }

    public void setFrom16to30Minutes(int from16to30Minutes) {
        this.from16to30Minutes = from16to30Minutes;
    }

    public int getFrom31to45Minutes() {
        return from31to45Minutes;
    }

    public void setFrom31to45Minutes(int from31to45Minutes) {
        this.from31to45Minutes = from31to45Minutes;
    }

    public int getFrom46to60Minutes() {
        return from46to60Minutes;
    }

    public void setFrom46to60Minutes(int from46to60Minutes) {
        this.from46to60Minutes = from46to60Minutes;
    }

    public int getFrom61to120Minutes() {
        return from61to120Minutes;
    }

    public void setFrom61to120Minutes(int from61to120Minutes) {
        this.from61to120Minutes = from61to120Minutes;
    }

    public int getPlus120Minutes() {
        return plus120Minutes;
    }

    public void setPlus120Minutes(int plus120Minutes) {
        this.plus120Minutes = plus120Minutes;
    }

    public BigDecimal getPercent0to15Minutes() {
        return percent0to15Minutes;
    }

    public void setPercent0to15Minutes(BigDecimal percent0to15Minutes) {
        this.percent0to15Minutes = percent0to15Minutes;
    }

    public BigDecimal getPercent16to30Minutes() {
        return percent16to30Minutes;
    }

    public void setPercent16to30Minutes(BigDecimal percent16to30Minutes) {
        this.percent16to30Minutes = percent16to30Minutes;
    }

    public BigDecimal getPercent31to45Minutes() {
        return percent31to45Minutes;
    }

    public void setPercent31to45Minutes(BigDecimal percent31to45Minutes) {
        this.percent31to45Minutes = percent31to45Minutes;
    }

    public BigDecimal getPercent46to60Minutes() {
        return percent46to60Minutes;
    }

    public void setPercent46to60Minutes(BigDecimal percent46to60Minutes) {
        this.percent46to60Minutes = percent46to60Minutes;
    }

    public BigDecimal getPercent61to120Minutes() {
        return percent61to120Minutes;
    }

    public void setPercent61to120Minutes(BigDecimal percent61to120Minutes) {
        this.percent61to120Minutes = percent61to120Minutes;
    }

    public BigDecimal getPercentPlus120Minutes() {
        return percentPlus120Minutes;
    }

    public void setPercentPlus120Minutes(BigDecimal percentPlus120Minutes) {
        this.percentPlus120Minutes = percentPlus120Minutes;
    }

    public BigDecimal getPercent0to60Minutes() {
        return percent0to60Minutes;
    }

    public void setPercent0to60Minutes(BigDecimal percent0to60Minutes) {
        this.percent0to60Minutes = percent0to60Minutes;
    }

    @Override
    public String toString() {
        return "StatsAlertedReportBeanFull{" +
                "refDate=" + refDate +
                ", portfolio='" + portfolio + '\'' +
                ", alertedCases=" + alertedCases +
                ", from0to15Minutes=" + from0to15Minutes +
                ", from16to30Minutes=" + from16to30Minutes +
                ", from31to45Minutes=" + from31to45Minutes +
                ", from46to60Minutes=" + from46to60Minutes +
                ", from61to120Minutes=" + from61to120Minutes +
                ", plus120Minutes=" + plus120Minutes +
                ", percent0to15Minutes=" + percent0to15Minutes +
                ", percent16to30Minutes=" + percent16to30Minutes +
                ", percent31to45Minutes=" + percent31to45Minutes +
                ", percent46to60Minutes=" + percent46to60Minutes +
                ", percent61to120Minutes=" + percent61to120Minutes +
                ", percentPlus120Minutes=" + percentPlus120Minutes +
                ", percent0to60Minutes=" + percent0to60Minutes +
                '}';
    }
}
