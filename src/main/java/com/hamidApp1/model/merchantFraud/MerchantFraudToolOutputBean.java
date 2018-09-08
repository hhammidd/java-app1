package com.hamidApp1.model.merchantFraud;

import com.hamidApp1.model.common.ServiceOperation;

import java.util.List;

public class MerchantFraudToolOutputBean {
    private ServiceOperation serviceOperation;
    private List<BaseMerchantFraudTool> merchantFraudBean;

    public ServiceOperation getServiceOperation() {
        return serviceOperation;
    }

    public void setServiceOperation(ServiceOperation serviceOperation) {
        this.serviceOperation = serviceOperation;
    }

    public List<BaseMerchantFraudTool> getMerchantFraudBean() {
        return merchantFraudBean;
    }

    public void setMerchantFraudBean(List<BaseMerchantFraudTool> merchantFraudBean) {
        this.merchantFraudBean = merchantFraudBean;
    }

    @Override
    public String toString() {
        return "MerchantFraudToolOutputBean{" +
                "serviceOperation=" + serviceOperation +
                ", merchantFraudBean=" + merchantFraudBean +
                '}';
    }
}
