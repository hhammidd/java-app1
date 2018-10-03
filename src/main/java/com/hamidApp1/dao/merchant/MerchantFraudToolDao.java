package com.hamidApp1.dao.merchant;

import com.hamidApp1.model.merchantFraud.BaseMerchantFraudToolBean;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MerchantFraudToolDao extends JpaRepository<BaseMerchantFraudToolBean, Integer> {
}
