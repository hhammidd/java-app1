package com.hamidApp1.service.merchant;

import com.hamidApp1.dao.merchant.MerchantFraudToolBigDao;

import com.hamidApp1.model.common.ServiceOperationBean;
import com.hamidApp1.model.merchantFraud.BaseMerchantFraudToolBean;
import com.hamidApp1.model.merchantFraud.MerchantFraudToolOutputBean;
import com.hamidApp1.service.util.Message;
import com.hamidApp1.service.util.ReturnResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantFraudToolService {

    private static final int INTERVAL_DAYS = 90;
    private static final String AMOUNT_LIMIT = ">=0";

    //private MerchantFraudToolDao merchantFraudToolDao;
     //MerchantFraudToolBigDaoImpl merchantFraudToolBigDao = new MerchantFraudToolBigDaoImpl();
    @Autowired
    private MerchantFraudToolBigDao merchantFraudToolBigDao;

    public MerchantFraudToolOutputBean getAllMerchantFrauds(String userCod) {
        ServiceOperationBean serviceOperationBean = null;
        MerchantFraudToolOutputBean outputBean = new MerchantFraudToolOutputBean();

 //       List<BaseMerchantFraudToolBean> merchantFraudHistoryBigList = merchantFraudToolBigDao.findInitialData(INTERVAL_DAYS, AMOUNT_LIMIT,new BigDecimal(0));
        merchantFraudToolBigDao.getData(1);
        List<BaseMerchantFraudToolBean> merchantFraudHistoryList = merchantFraudToolBigDao.findAll();
        outputBean.setMerchantFraudBean(merchantFraudHistoryList);
        serviceOperationBean = ReturnResult.getOperationResult("DONE", Message.OPERATION);
        outputBean.setServiceOperationBean(serviceOperationBean);

        return outputBean ;
    }
}
