package com.hamidApp1.service.users;

import com.hamidApp1.model.authentication.Frmhuser;

import java.util.List;

public interface UsersService {
    List<Frmhuser> findByUserCod(String userCode);
}
