package com.hamidApp1.model.report;

import java.math.BigDecimal;
import java.time.LocalDate;

public class StatsAlertedInsertBean {
    private LocalDate refDate;
    private String portfolio;
    private int alertedCases;
    private int tot15Minutes;
    private int tot30Minutes;
    private int tot45Minutes;
    private int tot60Minutes;
    private int tot120Minutes;
    private int totPlus120Minutes;
    private BigDecimal percent15Minutes;
    private BigDecimal percent30Minutes;
    private BigDecimal percent45Minutes;
    private BigDecimal percent60Minutes;
    private BigDecimal percent120Minutes;
    private BigDecimal pluspercent120Minute;

    public StatsAlertedInsertBean(LocalDate refDate, String portfolio, int alertedCases, int tot15Minutes, int tot30Minutes, int tot45Minutes, int tot60Minutes, int tot120Minutes, int totPlus120Minutes, BigDecimal percent15Minutes, BigDecimal percent30Minutes, BigDecimal percent45Minutes, BigDecimal percent60Minutes, BigDecimal percent120Minutes, BigDecimal pluspercent120Minute) {
        this.refDate = refDate;
        this.portfolio = portfolio;
        this.alertedCases = alertedCases;
        this.tot15Minutes = tot15Minutes;
        this.tot30Minutes = tot30Minutes;
        this.tot45Minutes = tot45Minutes;
        this.tot60Minutes = tot60Minutes;
        this.tot120Minutes = tot120Minutes;
        this.totPlus120Minutes = totPlus120Minutes;
        this.percent15Minutes = percent15Minutes;
        this.percent30Minutes = percent30Minutes;
        this.percent45Minutes = percent45Minutes;
        this.percent60Minutes = percent60Minutes;
        this.percent120Minutes = percent120Minutes;
        this.pluspercent120Minute = pluspercent120Minute;
    }

    public StatsAlertedInsertBean() {
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

    public int getTot15Minutes() {
        return tot15Minutes;
    }

    public void setTot15Minutes(int tot15Minutes) {
        this.tot15Minutes = tot15Minutes;
    }

    public int getTot30Minutes() {
        return tot30Minutes;
    }

    public void setTot30Minutes(int tot30Minutes) {
        this.tot30Minutes = tot30Minutes;
    }

    public int getTot45Minutes() {
        return tot45Minutes;
    }

    public void setTot45Minutes(int tot45Minutes) {
        this.tot45Minutes = tot45Minutes;
    }

    public int getTot60Minutes() {
        return tot60Minutes;
    }

    public void setTot60Minutes(int tot60Minutes) {
        this.tot60Minutes = tot60Minutes;
    }

    public int getTot120Minutes() {
        return tot120Minutes;
    }

    public void setTot120Minutes(int tot120Minutes) {
        this.tot120Minutes = tot120Minutes;
    }

    public int getTotPlus120Minutes() {
        return totPlus120Minutes;
    }

    public void setTotPlus120Minutes(int totPlus120Minutes) {
        this.totPlus120Minutes = totPlus120Minutes;
    }

    public BigDecimal getPercent15Minutes() {
        return percent15Minutes;
    }

    public void setPercent15Minutes(BigDecimal percent15Minutes) {
        this.percent15Minutes = percent15Minutes;
    }

    public BigDecimal getPercent30Minutes() {
        return percent30Minutes;
    }

    public void setPercent30Minutes(BigDecimal percent30Minutes) {
        this.percent30Minutes = percent30Minutes;
    }

    public BigDecimal getPercent45Minutes() {
        return percent45Minutes;
    }

    public void setPercent45Minutes(BigDecimal percent45Minutes) {
        this.percent45Minutes = percent45Minutes;
    }

    public BigDecimal getPercent60Minutes() {
        return percent60Minutes;
    }

    public void setPercent60Minutes(BigDecimal percent60Minutes) {
        this.percent60Minutes = percent60Minutes;
    }

    public BigDecimal getPercent120Minutes() {
        return percent120Minutes;
    }

    public void setPercent120Minutes(BigDecimal percent120Minutes) {
        this.percent120Minutes = percent120Minutes;
    }

    public BigDecimal getPluspercent120Minute() {
        return pluspercent120Minute;
    }

    public void setPluspercent120Minute(BigDecimal pluspercent120Minute) {
        this.pluspercent120Minute = pluspercent120Minute;
    }
}
