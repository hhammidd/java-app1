package com.hamidApp1.dao.merchant;

import com.hamidApp1.model.merchantFraud.BaseMerchantFraudToolBean;


import java.util.List;

public interface MerchantFraudToolBigDao {
    List<BaseMerchantFraudToolBean> findAll();

    void getData(int i);

    List<BaseMerchantFraudToolBean> findByString(String USER_COD);
}
