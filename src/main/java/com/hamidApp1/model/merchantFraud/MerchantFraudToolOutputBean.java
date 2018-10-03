package com.hamidApp1.model.merchantFraud;

import com.hamidApp1.model.common.ServiceOperation;
import com.hamidApp1.model.common.ServiceOperationBean;

import java.util.List;

public class MerchantFraudToolOutputBean {
    private ServiceOperationBean serviceOperationBean;
    private List<BaseMerchantFraudToolBean> merchantFraudBean;

    public MerchantFraudToolOutputBean(ServiceOperationBean serviceOperationBean, List<BaseMerchantFraudToolBean> merchantFraudBean) {
        this.serviceOperationBean = serviceOperationBean;
        this.merchantFraudBean = merchantFraudBean;
    }

    public MerchantFraudToolOutputBean() {
    }

    public ServiceOperationBean getServiceOperationBean() {
        return serviceOperationBean;
    }

    public void setServiceOperationBean(ServiceOperationBean serviceOperationBean) {
        this.serviceOperationBean = serviceOperationBean;
    }

    public List<BaseMerchantFraudToolBean> getMerchantFraudBean() {
        return merchantFraudBean;
    }

    public void setMerchantFraudBean(List<BaseMerchantFraudToolBean> merchantFraudBean) {
        this.merchantFraudBean = merchantFraudBean;
    }

    @Override
    public String toString() {
        return "MerchantFraudToolOutputBean{" +
                "serviceOperationBean=" + serviceOperationBean +
                ", merchantFraudBean=" + merchantFraudBean +
                '}';
    }
}
