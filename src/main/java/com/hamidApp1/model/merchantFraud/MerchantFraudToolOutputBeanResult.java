package com.hamidApp1.model.merchantFraud;

import com.hamidApp1.model.common.ServiceOperation;

public class MerchantFraudToolOutputBeanResult {
    private ServiceOperation serviceOperation;
    private BaseMerchantFraudTool merchantFraudBean;

    public ServiceOperation getServiceOperation() {
        return serviceOperation;
    }

    public void setServiceOperation(ServiceOperation serviceOperation) {
        this.serviceOperation = serviceOperation;
    }

    public BaseMerchantFraudTool getMerchantFraudBean() {
        return merchantFraudBean;
    }

    public void setMerchantFraudBean(BaseMerchantFraudTool merchantFraudBean) {
        this.merchantFraudBean = merchantFraudBean;
    }

    @Override
    public String toString() {
        return "MerchantFraudToolOutputBeanResult{" +
                "serviceOperation=" + serviceOperation +
                ", merchantFraudBean=" + merchantFraudBean +
                '}';
    }
}
