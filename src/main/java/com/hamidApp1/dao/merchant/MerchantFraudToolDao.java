package com.hamidApp1.dao.merchant;

import com.hamidApp1.model.merchantFraud.BaseMerchantFraudToolBean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MerchantFraudToolDao extends JpaRepository<BaseMerchantFraudToolBean, Integer> {

    @Query("SELECT u FROM BaseMerchantFraudToolBean u WHERE u.USER_COD = :USER_COD")
    List<BaseMerchantFraudToolBean> findOne(@Param("USER_COD")String USER_COD);
}
