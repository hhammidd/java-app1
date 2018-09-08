package com.hamidApp1.model.merchantFraud;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hamidApp1.service.json.serializer.LocalDateDeserializer;
import com.hamidApp1.service.json.serializer.LocalDateSerializer;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BaseMerchantFraudTool {

    private long rowId;
    private String userCod;
    private String portfolio;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate analysisDate;

    private String merchantId;
    private String merchantName;
    private String city;
    private String countryIso;
    private String country;
    private String mcc;
    private BigDecimal totalFraudApprovedAmount;
    private String amountLimitAnalyzed;
    private int fpi;
    private int analysisIntervalDays;
    private int involvedCards;
    private int blockedAndRevokedCards;
    private String typeMerchant;
    private String rule;
    private String action;
    private boolean specialCase;
    private BigDecimal score;

    public long getRowId() {
        return rowId;
    }

    public void setRowId(long rowId) {
        this.rowId = rowId;
    }

    public String getUserCod() {
        return userCod;
    }

    public void setUserCod(String userCod) {
        this.userCod = userCod;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public LocalDate getAnalysisDate() {
        return analysisDate;
    }

    public void setAnalysisDate(LocalDate analysisDate) {
        this.analysisDate = analysisDate;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryIso() {
        return countryIso;
    }

    public void setCountryIso(String countryIso) {
        this.countryIso = countryIso;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public BigDecimal getTotalFraudApprovedAmount() {
        return totalFraudApprovedAmount;
    }

    public void setTotalFraudApprovedAmount(BigDecimal totalFraudApprovedAmount) {
        this.totalFraudApprovedAmount = totalFraudApprovedAmount;
    }

    public String getAmountLimitAnalyzed() {
        return amountLimitAnalyzed;
    }

    public void setAmountLimitAnalyzed(String amountLimitAnalyzed) {
        this.amountLimitAnalyzed = amountLimitAnalyzed;
    }

    public int getFpi() {
        return fpi;
    }

    public void setFpi(int fpi) {
        this.fpi = fpi;
    }

    public int getAnalysisIntervalDays() {
        return analysisIntervalDays;
    }

    public void setAnalysisIntervalDays(int analysisIntervalDays) {
        this.analysisIntervalDays = analysisIntervalDays;
    }

    public int getInvolvedCards() {
        return involvedCards;
    }

    public void setInvolvedCards(int involvedCards) {
        this.involvedCards = involvedCards;
    }

    public int getBlockedAndRevokedCards() {
        return blockedAndRevokedCards;
    }

    public void setBlockedAndRevokedCards(int blockedAndRevokedCards) {
        this.blockedAndRevokedCards = blockedAndRevokedCards;
    }

    public String getTypeMerchant() {
        return typeMerchant;
    }

    public void setTypeMerchant(String typeMerchant) {
        this.typeMerchant = typeMerchant;
    }

    public String getRule() {
        return rule;
    }

    public void setRule(String rule) {
        this.rule = rule;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public boolean isSpecialCase() {
        return specialCase;
    }

    public void setSpecialCase(boolean specialCase) {
        this.specialCase = specialCase;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "BaseMerchantFraudTool{" +
                "rowId=" + rowId +
                ", userCod='" + userCod + '\'' +
                ", portfolio='" + portfolio + '\'' +
                ", analysisDate=" + analysisDate +
                ", merchantId='" + merchantId + '\'' +
                ", merchantName='" + merchantName + '\'' +
                ", city='" + city + '\'' +
                ", countryIso='" + countryIso + '\'' +
                ", country='" + country + '\'' +
                ", mcc='" + mcc + '\'' +
                ", totalFraudApprovedAmount=" + totalFraudApprovedAmount +
                ", amountLimitAnalyzed='" + amountLimitAnalyzed + '\'' +
                ", fpi=" + fpi +
                ", analysisIntervalDays=" + analysisIntervalDays +
                ", involvedCards=" + involvedCards +
                ", blockedAndRevokedCards=" + blockedAndRevokedCards +
                ", typeMerchant='" + typeMerchant + '\'' +
                ", rule='" + rule + '\'' +
                ", action='" + action + '\'' +
                ", specialCase=" + specialCase +
                ", score=" + score +
                '}';
    }
}
