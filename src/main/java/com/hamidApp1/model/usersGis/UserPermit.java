package com.hamidApp1.model.usersGis;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class UserPermit {

    @Id
    private int id_permission;
    private ArrayList<PermissionList> portfolioCreListBean;
}
