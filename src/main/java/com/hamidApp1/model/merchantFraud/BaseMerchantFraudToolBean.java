package com.hamidApp1.model.merchantFraud;


import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;



@Entity
@Table(name ="merchant_fraud_history")
public class BaseMerchantFraudToolBean implements Serializable {

    @Id
    private int rowId;
    private String USER_COD;
    private String PORTFOLIO;
    private Date ANALYSIS_DATE;

    @Column(name = "ID_MERCHANT")
    private String merchantId;
    @Column(name = "MERCHANT")
    private String merchantName;
    @Column(name = "CITY")
    private String city;
    @Column(name = "COUNTRY_ISO")
    private String countryIso;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "MCC")
    private String mcc;



    //@Column(name = "TOTAL_FRAUD_APPROVED_AMOUNT", precision = 19, scale = 4)
    @Column(name = "TOTAL_FRAUD_APPROVED_AMOUNT")
    private BigDecimal totalFraudApprovedAmount;

    @Column(name = "AMOUNT_LIMIT")
    private String amountLimitAnalyzed;

    @Column(name = "FPI")
    private int fpi;
    @Column(name = "INTERVAL_DAYS")
    private int analysisIntervalDays;
    @Column(name = "INVOLVED_CARDS_QTY")
    private int involvedCards;
    @Column(name = "BLOCKED_REVOKED_CARDS_QTY")
    private int blockedAndRevokedCards;
    @Column(name = "TYPE_MERCHANT")
    private String typeMerchant;
    @Column(name = "RULE_TYPE")
    private String rule;
    @Column(name = "ACTION")
    private String action;

    @Column(name = "SPECIAL_CASE")
    private boolean specialCase;
    @Column(name = "SCORE_POINT")
    private BigDecimal score;


    public BaseMerchantFraudToolBean() {
    }

    public BaseMerchantFraudToolBean(int rowId, String USER_COD, String PORTFOLIO, Date ANALYSIS_DATE, String merchantId, String merchantName, String city, String countryIso, String country, String mcc, BigDecimal totalFraudApprovedAmount, String amountLimitAnalyzed, int fpi, int analysisIntervalDays, int involvedCards, int blockedAndRevokedCards, String typeMerchant, String rule, String action, boolean specialCase, BigDecimal score) {
        this.rowId = rowId;
        this.USER_COD = USER_COD;
        this.PORTFOLIO = PORTFOLIO;
        this.ANALYSIS_DATE = ANALYSIS_DATE;
        this.merchantId = merchantId;
        this.merchantName = merchantName;
        this.city = city;
        this.countryIso = countryIso;
        this.country = country;
        this.mcc = mcc;
        this.totalFraudApprovedAmount = totalFraudApprovedAmount;
        this.amountLimitAnalyzed = amountLimitAnalyzed;
        this.fpi = fpi;
        this.analysisIntervalDays = analysisIntervalDays;
        this.involvedCards = involvedCards;
        this.blockedAndRevokedCards = blockedAndRevokedCards;
        this.typeMerchant = typeMerchant;
        this.rule = rule;
        this.action = action;
        this.specialCase = specialCase;
        this.score = score;
    }

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    public String getUSER_COD() {
        return USER_COD;
    }

    public void setUSER_COD(String USER_COD) {
        this.USER_COD = USER_COD;
    }

    public String getPORTFOLIO() {
        return PORTFOLIO;
    }

    public void setPORTFOLIO(String PORTFOLIO) {
        this.PORTFOLIO = PORTFOLIO;
    }

    public Date getANALYSIS_DATE() {
        return ANALYSIS_DATE;
    }

    public void setANALYSIS_DATE(Date ANALYSIS_DATE) {
        this.ANALYSIS_DATE = ANALYSIS_DATE;
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
}


