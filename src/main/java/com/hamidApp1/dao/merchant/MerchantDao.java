package com.hamidApp1.dao.merchant;

import com.hamidApp1.model.users.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;

public interface MerchantDao extends JpaRepository<User,Long> {

}
