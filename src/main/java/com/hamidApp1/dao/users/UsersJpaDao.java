package com.hamidApp1.dao.users;

import com.hamidApp1.model.authentication.Frmhuser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UsersJpaDao extends JpaRepository<Frmhuser,String > {

    //@Query("SELECT u FROM frmhuser u WHERE u.COD_USER = :COD_USER")
    //public List<com.hamidApp1.model.authentication.Frmhuser> findByUserCod(@Param("COD_USER") String COD_USER);

}
